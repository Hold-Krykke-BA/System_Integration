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

### CacheService

### RegisterSaleService
**Initialized with:**
* Spring Boot DevTools
* Lombok
* Spring Web
* Spring REST Repositories
* Spring Data MongoDB
* Spring Boot Actuator
* Netflix Eureka Discovery Client
* Spring Kafka

#### Integrations
Cloud-hosted MongoDB
Kafka 

#### Description
The service is responsible for receiving incoming orders, splitting them in two if they are mixed (digital/physical), storing the order(s) and producing Kafka messages on two topics, to announce that an order has been received and stored. 

#### MongoDB

#### Kafka
The service produces messages on two topics, both can be seen in the following images:  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/KafkaMagicRegister.PNG)  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/KafkaMagicCache.PNG)  

### ProcessSaleService
**Initialized with:**
* Spring Boot DevTools
* Lombok
* Spring Web
* Spring REST Repositories
* Spring Data MongoDB
* Spring Boot Actuator
* Netflix Eureka Discovery Client
* Spring Kafka
* Camunda
* H2 database
* Spring Boot JPA
* Spring Boot Mail

#### Integrations
Cloud-hosted MongoDB
Embedded Camunda, with internal H2 database
Spring Boot Mail
Kafka 

#### Description
The service is responsible for consuming incoming Kafka messages containing order numbers for new orders, polling the MongoDB for the orders, processing the orders via the embedded Camunda, changing the order status during the processing and sending out emails for the customers with order statuses. 

#### Kafka
The service consumes messages on the following format:
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/KafkaMagicRegister.PNG)  
![image](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/Examproject/Diagrams/KafkaMagicCache.PNG)  

#### Cloud-hosted MongoDB

#### Embedded Camunda

#### Spring Boot Mail



## How to run

## Resources

