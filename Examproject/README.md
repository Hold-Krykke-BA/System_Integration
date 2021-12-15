# System Integration Exam Project 

## Contributors
- _[Rúni Vedel Niclasen - cph-rn118](https://github.com/Runi-VN)_
- _[Camilla Jenny Valerius Staunstrup - cph-cs340](https://github.com/Castau)_

## Assignment Description
* [Exam Assignment Document](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Docs/SI2021ExamAssignment.pdf)

## Process
### Business case
Physical bookstore with a small monolithic online store (sells books, ebooks and audiobooks) has been acquired by a larger corporation. The online store should present the same to the customers, but the backend needs a complete overhaul to conform and comply with the corporation's requirements.

### Initial diagram  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/SystemDiagramFinal.PNG)

### Requirements
* Integration with corporations central-European storage facility database
* Country-specific storage facility with database
* Caching of the number of available books local and remote
* Storage of order data in cloud storage
* Employees validate physical sales in a BPMN process
  * Online ebook/audiobook sales do not require human validation
* Customer receives Order and Shipping confirmation mail
* Validation of ISBN when adding new books to the database
* Inter-service-communication where necessary
* Logging in all services

### Technologies
| Technology  |
|:--|
| Spring Boot |
|  Netflix Eureka |
|  Apache Camel |
|  Camunda |
|  Docker |
|  H2 database |
|  MongoDB Cloud |
|  Kafka |

## Services

### BookService

#### Integrations and tools
* Cloud-hosted MongoDB
* Kafka
* SOAP

#### Description
```diff
- TODO
```
#### Cloud-hosted MongoDB
```diff
- TODO
```
#### Kafka
```diff
- TODO
```
#### SOAP
```diff
- TODO
```

### CacheService

#### Integrations and tools
* External API
* Self-hosted Redis hosted in docker
* Cloud-hosted MongoDB
* Apache Camel
* gRPC
 
#### Description
```diff
- TODO
```
#### External API
```diff
- TODO
```
#### Self-hosted Redis
```diff
- TODO
```
#### Cloud-hosted MongoDB
```diff
- TODO
```
#### Apache Camel
```diff
- TODO
```
#### gRPC
```diff
- TODO
```

### RegisterSaleService

#### Integrations and tools
* Cloud-hosted MongoDB  
* Kafka 

#### Description
The service is responsible for receiving incoming orders, splitting them in two if they are mixed (digital/physical), storing the order(s) and producing Kafka messages on two topics, to announce that an order has been received and stored. 

#### Cloud-hosted MongoDB
The `createOrder(Order order)` endpoint in the KafkaOrderController saves the order to the MongoDB after some checks and possible splits have occured. The MongoDB connection is handled through spring with the use of extending the `MongoRepository`.  
Documents in the Orderstore are designed as follows:  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/mongoDBOrders.PNG)  

#### Kafka
The service produces messages on two topics, both can be seen in the following images:  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/KafkaMagicRegister.PNG)  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/KafkaMagicCacheTopics.PNG)  

### ProcessSaleService

#### Integrations and tools
* Cloud-hosted MongoDB  
* Embedded Camunda, with internal H2 database  
* Spring Boot Mail  
* Kafka  

#### Description
The service is responsible for consuming incoming Kafka messages containing order numbers for new orders, polling the MongoDB for the orders, processing the orders via the embedded Camunda, changing the order status during the processing and sending out emails for the customers with order statuses. 

#### Kafka
The service consumes messages on the following format:  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/processingMSG.PNG)  

#### Cloud-hosted MongoDB
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
In ordder to send emails to the customers during the order processing we are using the JavaMailSender. The result are mails looking like this:  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/CustomerMail.PNG)  


## How to run
* Paste the relevant `application.properties` files to all the services in your clone (ours are ignored due to secrets) and set your own mongo cloud connection strings
* Run `docker compose up -d` in the folder with the [docker-compose.yml](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/docker-compose.yml)
* Run `docker run --name redis -v redis-data:/data -p 6379:6379 -d redis:alpine` in git bash
* Build all the services

### BookService-specific
* [SOAP API](http://webservices.daehosting.com/services/isbnservice.wso) 
* Add a 'web service' as framework support to the project using the WSDL link above. It is currently generated in `holdkrykke.bookservice.services.soap.consumingwebservice`.

### CacheService-specific
* Run the `compile` action in the `Maven Lifecycle` to compile the generated classes in the `target` foler, this is required for gRPC


## Resources

