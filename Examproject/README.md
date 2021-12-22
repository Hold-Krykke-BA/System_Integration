
# System Integration Exam Project 

## Contributors
- _[Rúni Vedel Niclasen - cph-rn118](https://github.com/Runi-VN)_
- _[Camilla Jenny Valerius Staunstrup - cph-cs340](https://github.com/Castau)_

## Assignment Description
* [Exam Assignment Document](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Docs/SI2021ExamAssignment.pdf)

## Online repository
The repository is hosted online on Github at https://github.com/Hold-Krykke-BA/System_Integration/tree/main/Examproject.

## Video
The video describing this project, as required by the assignment, is hosted on youtube at ...

```diff
- todo add link when uploaded
```


## Table of Contents
- [Process](#process)
  * [Business case](#business-case)
  * [System Diagram](#system-diagram)
  * [Requirements](#requirements)
  * [Technologies](#technologies)
- [Services](#services)
  * [BookService](#bookservice)
    + [Integrations and tools](#integrations-and-tools)
    + [Description](#description)
    + [MongoDB Atlas BookStore](#mongodb-atlas-bookstore)
    + [Apache Kafka](#apache-kafka)
    + [SOAP](#soap)
  * [CacheService](#cacheservice)
    + [Integrations and tools](#integrations-and-tools-1)
    + [Description](#description-1)
    + [External API](#external-api)
    + [Redis](#redis)
    + [MongoDB Atlas BookStore](#mongodb-atlas-bookstore-1)
    + [Apache Camel](#apache-camel)
    + [gRPC](#grpc)
  * [RegisterSaleService](#registersaleservice)
    + [Integrations and tools](#integrations-and-tools-2)
    + [Description](#description-2)
    + [MongoDB Atlas](#mongodb-atlas)
    + [Apache Kafka](#apache-kafka-1)
  * [ProcessSaleService](#processsaleservice)
    + [Integrations and tools](#integrations-and-tools-3)
    + [Description](#description-3)
    + [Apache Kafka](#apache-kafka-2)
    + [MongoDB Atlas](#mongodb-atlas-1)
    + [Embedded Camunda](#embedded-camunda)
    + [Spring Boot Mail](#spring-boot-mail)
- [How to run](#how-to-run)
  * [BookService-specific](#bookservice-specific)
  * [CacheService-specific](#cacheservice-specific)

## Process
### Business case
A physical bookstore with a small monolithic online store (books, ebooks and audiobooks) has been acquired by a larger corporation. The online store should present the same to the customers, but the backend needs a complete overhaul to conform and comply with the corporation's requirements.

### System Diagram  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/SystemDiagramFinalRenamed.png)

### Requirements
* Caching the number of available books local and remote
* Integration with the  corporations remote storage facility database
* Country-specific local storage facility with a cloud hosted database
* Validation of ISBN when adding new books 
* Storage of order data in a cloud hosted database
* Microservice choreography when necessary
* Handling book sales in a BPMN process based on the order item being digital or physical
* Customers receiving Order and Shipping confirmation by mail
* Logging in all services

### Technologies
| Technology / Tools / Integration | Usage |
|:--|:--|
| Spring Boot | Java framework used in all services, including many Spring Boot tools |
|  Netflix Eureka | Middleware used for discovery of services |
|  Apache Camel | M.O.M. middleware used for data transformation in one of our services |
|  Camunda | Workflow and decision automation, used embedded in our one of services|
|  Docker | Containers running images of Kafka and Redis |
|  H2 database | Internally used by embedded Camunda |
|  MongoDB Atlas | Cloud NoSQL clustered database  |
|  Apache Kafka |Used as a message broker between services |
|  Redis | Key-value store used for caching |
|  gRPC |Remote procedure calls for getting books form our service|
|  BloomRPC |RPC client|
|  Postman |HTTP client used for the REST endpoints|
|  SOAP | Message protocol used by our service to validate ISBN|

## Services

Each service have its own purpose, but there are some similarities.

**Exceptions** are typically handled by Spring Boot, such as for the REST API's where Spring has integrated error handling - which is further customized in `application.properties`.  
Custom exceptions can be found in the services own folder, such as the [Exceptions](Services/BookService/src/main/java/holdkrykke/Exceptions) folder for BookService.

### BookService

#### Integrations and tools
* MongoDB Atlas
* Apache Kafka
* SOAP

#### Description
The service is responsible for adding new books to the MongoDB, and while doing so also validating the ISBN through an external SOAP API. The service is also responsible for keeping the quantity of a given book up-to-date in the MongoDB.

The service exposes two REST API's, one for adding new books and one for validating ISBN as a proxy-service for the consumed SOAP API.

#### MongoDB Atlas BookStore
The MongoDB connection is handled through spring with the use of extending the `MongoRepository`.  
The database is queried at two times:  
When the `POST` endpoint `addBook` is queried for adding a new book.   
When a Kafka message is consumed from the RegisterSale service, that prompts the service to decrement the quantity of the book in the database based on the sold amount.

#### Apache Kafka
The service consumes messages on the following format sent on the topic `saleregisteredcaching`:  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/cachingMSG.PNG)

The messages are deserialized from JSON directly to the corresponding Java `Order` type for easy handling. The service ensures that the MongoDB Book Store is up-to-date on the sold books.

#### SOAP
The SOAP API can be found [here](http://webservices.daehosting.com/services/ISBNService.wso) with accompanying WSDL file. It provides two methods, one for each ISBN format (ISBN10/ISBN13).

The SOAP API is consumed by the service and a Client class ([ISBNValidationClient](Services/BookService/src/main/java/holdkrykke/bookservice/services/soap)) has been created, which exposes a single method `validateIsbn(isbn)`. This method distinguishes the input as being either of the ISBN formats and calls the appropriate method from the external API.

### CacheService

#### Integrations and tools
* External API
* Redis hosted in docker container
* MongoDB Atlas
* Apache Camel
* gRPC
 
#### Description
The service is responsible for caching the quantity of the most accessed books from both the `External API` and Mongo Atlas in the Redis key-value store. The service exposes a REST API for the Redis cache and also exposes the gRPC server for querying.

The application follows a certain flow for the gRPC requests, where priority is the cache over other data stores. The application converts data of various types (Strings, Java Objects, JSON) into a DTO return type and vice-versa. Once a data store other than the cache has been queried, the cache will immediately be updated with the new information. Individual items in the cache lasts for 5 minutes.

#### External API
We are using [openlibrary](https://openlibrary.org) as resource for our `External API` in the service. We are using the Spring Boot `RestTemplate` for this, executing calls to this service and later transforming the return data (Strings, JSON) into the appropriate Java objects.

The external API provides many features and queries of mostly unknown proportion. The API is not fully documented, and constantly changing. Our service provides queries to the API based on three parameters: ISBN, title and authors.

The external API is typically queried once a result is not available in the cache.

#### Redis
Redis is hosted in docker on an alpine image with the purpose of caching often-requested books, their quantities and location (internally, externally). For this we created a custom DTO. As it is a cache we had to investigate the best way to handle it, not only for Redis, but for use in a Spring Boot environment.

Initially we designed the Redis solution as the others, using Spring Boot and their data store solution for Redis, the `RedisTemplate` and `RedisRepository`. We also looked at other Spring Caching solutions.  
However, as we wanted to create custom queries and wanted support for custom caching (5-minute TimeToLive indexes), we abandoned the default RedisRepository and instead created our own adaption that still uses Spring Boot to connect to Redis.

Redis is always queried first, and Redis is updated whenever one of the other data stores are queried.

#### MongoDB Atlas BookStore
The MongoDB connection is handled through Spring with an extended `MongoRepository`. It consists of a certain Book type, stored as a Document. This type is then converted to an item fit for returning through gRPC for use further down the application flow.

The database is typically queried once a result is not available in the cache.

#### Apache Camel
Apache was planned and intended to be used for what it does best using Enterprise Integration Patterns:  
- Handling transportation between the three data stores
- Transforming the data to the neccessary types (From several data sources into the DTOs for caching books and the gRPC return method)
- Aggregating same book results (i.e., same book in internal and external store) according to business rules
- Validating the input type and output type
- Handling fields that may be empty at times, such as books from the external API that did not have page numbers noted.

Due to time constraints, but also dependency issues, we were not able to complete this to the deadline. Instead we implemented what was written above using Java, Spring, Google Gson and various other methods.

We intend to continue with this implementation of Apache Camel, or otherwise implement it in our application, in the time between the deadline and the presentation.


#### gRPC
The service exposes a gRPC server for for querying books stored either in the cache, the External API og MongoDB. The service is generated from a `.proto` file when Maven compiles. We use BloomRPC as the client to connect to the gRPC endpoint at port `6000`.

### RegisterSaleService

#### Integrations and tools
* MongoDB Atlas
* Kafka 

#### Description
The service is responsible for receiving incoming orders, splitting them in two if they are mixed (digital/physical), storing the order(s) and producing Kafka messages on two topics, to announce that an order has been received and stored. The service exposes a REST endpoint to place an order `localhost:9002/kafka/register`.

#### MongoDB Atlas
The endpoint `localhost:9002/kafka/register` in the KafkaOrderController saves the order to the MongoDB after some checks and possible splits have occured. The MongoDB connection is handled through spring with the use of extending the `MongoRepository`.  
Documents in the Orderstore are designed as follows:  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/mongoDBOrders.PNG)  

#### Apache Kafka
The service produces messages on two topics, both can be seen in the following images:  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/KafkaMagicRegister.PNG)  
Where the message payload is the order number.


![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/KafkaMagicCacheTopics.PNG)  
Where the payload is the whole order, with information necessary to update the book quantity.


### ProcessSaleService

#### Integrations and tools
* MongoDB Atlas 
* Embedded Camunda, with internal H2 database  
* Spring Boot Mail  
* Apache Kafka

#### Description
The service is responsible for:
- Consuming incoming Kafka messages containing order numbers for new orders
- Polling the MongoDB for the orders
- Processing the orders via the embedded Camunda
- Changing the order status during the processing
- Sending emails to the customers with order statuses. 

#### Apache Kafka
The service consumes messages on the following format sent on the topic `saleregisteredprocessing`:  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/processingMSG.PNG)  

#### MongoDB Atlas
The `consume(GenericMessage<OrderNumberDTO>  message)` method initiates the polling of the MongoDB, checks that the order status is registered before initiating Camunda. During the several Camunda processes, the order status is updated in MongoDB. The MongoDB connection is handled through spring with the use of extending the `MongoRepository`.

#### Embedded Camunda
Camunda is embedded in the service and is initiated by `consume(GenericMessage<OrderNumberDTO>  message)` after the order status has been checked, with the `order` and `orderType` as variables. The flow in Camunda is as follows:  
 ![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/CamundaBPMN.PNG)  
* The order is sent through the `Order Type Rules` check
  ![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/CamundaRulesDMN.PNG)  
* The output from the check determines if the order needs human handling and this decision is handled by a gate. 
* If the order consists of digital books the order is processed by the service task `Ship Digital Order` which is responsible for updating the order status to `shipped` and sending the customer an email, alerting them that the order is on the way. 
* If the order consists of physical books, the order is processed by the service task `Order Status Processing` that is responsible for updating the order status to `processing` and sending the customer an email alerting of the status change. 
  * The order then needs to be collected and assembled by a human worker and marked as done when it's ready for shipping
  * A human worker handles the shipping and marks the orders as done
  * At last, the order is processed by the service task `Order Status Shipped` which is responsible for updating the order status to `shipped` and sending the customer an email, alerting them that the order is on the way. 
* The order has been shipped and the Camunda process terminates

The human tasks in the Camunda process can be seen in the following gif:
![Human Task](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/camunda.gif?raw=true)  

#### Spring Boot Mail
We use google SMTP as our mail provider, and in order to send emails to the customers during the order processing we are using the JavaMailSender. The result are mails looking like this:  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/CustomerMail.PNG)  


## How to run
* Paste the relevant `application.properties` files to all the services in your clone (ours are ignored due to secrets) and set your own MongoDB Atlas connection strings
* Run `docker compose up -d` in the folder with the [docker-compose.yml](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/docker-compose.yml)
* Run `docker run --name redis -v redis-data:/data -p 6379:6379 -d redis:alpine` in git bash
* Build all the services

### BookService-specific
* [SOAP API](http://webservices.daehosting.com/services/isbnservice.wso) 
* Add a 'web service' as framework support to the project using the WSDL link above. It is currently generated in `holdkrykke.bookservice.services.soap.consumingwebservice`.

### CacheService-specific
* Run the `compile` action in the `Maven Lifecycle` to compile the generated classes in the `target` foler, this is required for gRPC
