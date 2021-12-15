# ProcessSaleService

## Contributors

- _[Rúni Vedel Niclasen - cph-rn118](https://github.com/Runi-VN)_
- _[Camilla Jenny Valerius Staunstrup - cph-cs340](https://github.com/Castau)_

## Service Description
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


#### Integrations and tools
* Cloud-hosted MongoDB  
* Embedded Camunda, with internal H2 database  
* Spring Boot Mail  
* Kafka  

#### Description
The service is responsible for consuming incoming Kafka messages containing order numbers for new orders, polling the MongoDB for the orders, processing the orders via the embedded Camunda, changing the order status during the processing and sending out emails for the customers with order statuses. 
