# CacheService

## Contributors

- _[Rúni Vedel Niclasen - cph-rn118](https://github.com/Runi-VN)_
- _[Camilla Jenny Valerius Staunstrup - cph-cs340](https://github.com/Castau)_

## Service Description

Initialized with:
- Spring BOot DevTools
- Lombok
- Spring Web
- Spring HATEOAS
- Spring REST Repositories
- Spring Data MongoDB
- Spring Data Redis
- Spring Boot Actuator
- Netflix Eureka Discovery Client

### Implementation details
Spring Data Redis allows use of both `Lettuce` and `Jedis` integrations.  
Lettuce is basically a wrapper for Jedis with additional features on top (that we do not need),  
so we decided to use Jedis due to familiarity and simplicity.


## Integrations
- External API at ...
- Self-hosted Redis hosted in docker at localhost:1234
- Cloud-hosted MongoDB Book storage

## Tools
- Netflix Eureka
- Apache Camel
- Spring Boot with plugins for MongoDB, Redis and REST
- gRPC

## Setup
1. Run Redis through docker with command `docker run --name redis -v redis-data:/data -p 6379:6379 -d redis:alpine`.
2. Build project using Maven
3. Run project


## Helpers
- Integrated Camel plugin for the IntelliJ IDEA IDE
![image](https://user-images.githubusercontent.com/37186286/145678245-e7683519-28d6-40fb-a839-5c2cb691debf.png)  
- Integrated gRPC plugin for the IntelliJ IDEA IDE
![image](https://user-images.githubusercontent.com/37186286/145678445-3f7eb144-c89e-4b6d-b072-309b1beb0c19.png)
