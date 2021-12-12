# BookService

## Contributors

- _[Rúni Vedel Niclasen - cph-rn118](https://github.com/Runi-VN)_
- _[Camilla Jenny Valerius Staunstrup - cph-cs340](https://github.com/Castau)_

## Service Description

Initialized with:

- Spring Boot DevTools
- Lombok
- Spring Web (if we are using REST for addBook)
- Spring HATEOAS
- Spring Data MongoDB (for MongoDBREpository)
- Spring Web Services (for SOAP)
- Netflix Eureka Discovery Client

Later, the following was added:
- todo

External SOAP API was manually discovered through [Postman](https://documenter.getpostman.com/view/8854915/Szf26WHn#58604e5a-7631-43dc-8ed4-904f4223d59b).  
The API and its WSDL file is hosted [here](http://webservices.daehosting.com/services/isbnservice.wso) and is fetched remotely on project build execution.

### Generating SOAP 
Add a 'web service' as framework support to the project using the WSDL link above. It is currently generated in `holdkrykke.bookservice.services.soap.consumingwebservice`, so you should not need to to this.

### Setup
1. Build and run
2. Try out the REST API at `http://localhost:9004/isbn/87-01-32671-6`