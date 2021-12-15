# RegisterSaleService

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


#### Integrations and tools
* Cloud-hosted MongoDB  
* Kafka 

#### Description
The service is responsible for receiving incoming orders, splitting them in two if they are mixed (digital/physical), storing the order(s) and producing Kafka messages on two topics, to announce that an order has been received and stored. 
