# MiniProject 2  
## Contributors
- _[Rúni Vedel Niclasen - cph-rn118](https://github.com/Runi-VN)_
- _[Camilla Jenny Valerius Staunstrup - cph-cs340](https://github.com/Castau)_


## [Assignment Description](A4-MP-MS.pdf)

## Process
Continued from E4 -> E5 -> MiniProject 2

## Results
We had a lot of dependency problems in this assignment, especially regarding the clientservice, which we had to give up on since we ran out of time.  
Our main problem in the clientservice was getting the netflix dependencies and ribbon and feign working together, combined with issues around the connection to the other services. We ended up with a connection to the other service but without being able to hit the endpoints in the service.   

This meant that the majority of our time in this assignment was spent solving strange dependency issues and errors and then not having time to implement the rest of the planned solution.

It is worth mentioning that all of the services run as, or close to how, they should and are being registered by Eureka, but the interconnecting part of the Netflix system is missing due to the above reasons.

## Resources
- https://spring.io/guides/gs/accessing-data-mongodb/
- https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.nosql.mongodb
