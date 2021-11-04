# Client application

## Client flow
According to the assignment description, the client should:
1. a
2. b
3. c


<p style="color: red"><i>The client seems to be have both producer and consumer responsibilities.</i></p>

## Todo
1. Dora's Producers have an `application.yml` file setup in the resources folder:
- https://github.com/datsoftlyngby/soft2021fall-SI/blob/main/code/p9-Kafka/P9-Kafka-Producer-1/src/main/resources/application.yml
- https://github.com/datsoftlyngby/soft2021fall-SI/blob/main/code/p9-Kafka/P9-Kafka-Producer-2/src/main/resources/application.yml
- https://github.com/datsoftlyngby/soft2021fall-SI/blob/main/code/p9-Kafka/P9-Kafka-Producer-3/src/main/resources/application.yml
    - How should we set ours up? Should we create multiple like she has multiple producers?
    - For now I added the P3 to the repo as this repo is based on P3.

2. Added setup like in other producers. Fix so it fits the assignment.
3. Producer1 has a callback. Should we use this? https://github.com/datsoftlyngby/soft2021fall-SI/blob/main/code/p9-Kafka/P9-Kafka-Producer-1/src/main/java/dk/dd/kafkaproducer1/producer/ProducerController.java (Go one level out to see its implementation)





## Setup
1. Start Docker
2. Deploy the environment by executing:  
`docker-compose up -d`
3. Ensure the deployment is successful and all components are up and running:  
`docker ps`

Trying it out:

4. Get into Kafka-Tools for access to its CLI:  
winpty `docker exec -ti kafka bash`
5. Inside CLI, create a Kafka topic:  
`kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 2 --topic to-do-list`
6. Check it is created:  
`kafka-topics --list --bootstrap-server localhost:9092`
7. Get details about it:  
`kafka-topics --describe --bootstrap-server localhost:9092 --topic to-do-list`
8. Send messages to the topic by use of kafka-console-producer. A message is a key:value pair:  
`kafka-console-producer --broker-list localhost:9092 --topic to-do-list --property "parse.key=true" --property "key.separator=:"`
9. Type in for example the following messages:
   >1:Read the instructions, listen to explanations  
   >2:Understand the instructions, ask questions, if needed  
   >3:Follow the instructions  
   >4:Move on to examining and consuming the messages  

    Ctrl/C for end  
10. Read the topic with kafka-console-consumer:  
`kafka-console-consumer --bootstrap-server localhost:9092 --from-beginning --topic to-do-list --property "print.key=true"`
11. To read from a specified partition only, e.g. either 0 or 1 in this example:  
`kafka-console-consumer --bootstrap-server localhost:9092  --from-beginning --topic to-do-list --property print.key=true --partition 0`
12. To read records starting from a specified offset (now it says ''from beginning'', change it to either a number or 'earliest', 'latest', etc.):  
`kafka-console-consumer --bootstrap-server localhost:9092  --topic to-do-list --property print.key=true --partition 1 --offset 2`
13. Stop any console consumers with a CTRL+C
14. Close the shell with a CTRL+D
15. To shut down the docker container, use the command: docker-compose down



