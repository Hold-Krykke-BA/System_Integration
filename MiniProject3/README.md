# MiniProject 3

## Contributors
- _[Rúni Vedel Niclasen - cph-rn118](https://github.com/Runi-VN)_
- _[Camilla Jenny Valerius Staunstrup - cph-cs340](https://github.com/Castau)_

## [Assignment Description](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/MiniProject3/A9-MOM.pdf)

## Process
Our initial plan with this assignment was to create an application that would communicate with various banks and forward them information about loan applicants. The banks would then respond to the application with their offers to the loan applicant. The Loan applicant would be presented with a list of all the offers and would then choose one and communicate back to that bank. 

The communication between the application and the banks would be through Apache Kafka. The application would have both producer and consumer responsibilities, whereas the banks would be replying consumers. 
The replies from the banks would be sorted using Apache Camel and the loan applicant would respond to the chosen bank through a REST endpoint using the offers unique ID. In the following is a drawing of our plan:
![image](https://user-images.githubusercontent.com/35559774/141858811-906a0d8b-7ed9-4f07-9860-f65057f799a4.png)


## Results
We have implemented the application with the producer and consumer responsibility and the consumer (bank). The replies from the banks are sorted by Apache Camel and only the bank-accepted offers are shown to the loan applicant. Additionally, we have a REST endpoint for the loan applicant to respond to.    
We had a lot of trouble with Kafka, both regarding the implementation of replying consumers and then running more instances of the consumers (banks), and have not yet found a way to get the latter working.

## To run this assignment 
- Clone the repo
- Run `docker compose up -d` in the Client root
- Open the Client and the KafkaConsumer in IntelliJ and run them both
- Call `POST: localhost:9002/loanapplication` in postman using a Json object as the body
  - Example object: 
  ```json
  {
    "ssn": 2503781524,
    "creditScore": 400,
    "loanAmount": 250000,
    "currentDebt": 500000,
    "yearlySalary": 350000,
    "loanType": "VEHICLE",
    "applicationID": ""
  }
  ```


## Resources
- [medium.com/@jhansireddy007/how-to-parallelise-kafka-consumers-59c8b0bbc37a](https://medium.com/@jhansireddy007/how-to-parallelise-kafka-consumers-59c8b0bbc37a)
- [stackchief.com/blog/Spring%20Boot%20Kafka%20Consumer](https://www.stackchief.com/blog/Spring%20Boot%20Kafka%20Consumer)
- [stackoverflow.com/questions/64443749/multiple-consumers-using-spring-kafka-with-reply-topic-being-written-outside-spr](https://stackoverflow.com/questions/64443749/multiple-consumers-using-spring-kafka-with-reply-topic-being-written-outside-spr)
- [github.com/x14gauravg/RequestReplyKafka/tree/master/src/main/java/com/gauravg/controller](https://github.com/x14gauravg/RequestReplyKafka/tree/master/src/main/java/com/gauravg/controller)
- [camel.apache.org/components/next/kafka-component.html](https://camel.apache.org/components/next/kafka-component.html)
- [camel.apache.org/camel-kafka-connector/next/](https://camel.apache.org/camel-kafka-connector/next/)
