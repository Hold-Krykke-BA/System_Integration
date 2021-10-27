# Assignment Banking operations
This is an exercise rather than a studypoint assignment.

## Contributors
- _[Rúni Vedel Niclasen - cph-rn118](https://github.com/Runi-VN)_
- _[Camilla Jenny Valerius Staunstrup - cph-cs340](https://github.com/Castau)_

## Description

The customer application:  
- makes a loan requests to multiple banks;
- collects non-binding bank quotes from (simulated) bank applications;
- compares the quotes and selects one, based on its own financial status and
criteria


## Application setup

A simple overview of our understanding can be seen here:  
![Mockup of conceptual understanding](/Concept.png)

### The client
There is one client that requests several banks. The client can be found in [/Client](./Client).

### The banks
There are several banks that respond to the client. The bank can be found in [/Bank](./Bank).  
The banks should be loaded several times for simulating several banks and responses. 

## Resources
- https://www.rabbitmq.com/tutorials/tutorial-six-java.html
  - https://github.com/rabbitmq/rabbitmq-tutorials/blob/master/java/RPCClient.java
  - https://github.com/rabbitmq/rabbitmq-tutorials/blob/master/java/RPCServer.java