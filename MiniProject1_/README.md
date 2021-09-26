# MiniProject 1 - Web Services and APIs

## Contributors
- _Rúni Vedel Niclasen - cph-rn118_
- _Camilla Jenny Valerius Staunstrup - cph-cs340_

## About

In short, the three services cover the following areas:
- gRPC: Studypoints & text file data storage
- SOAP: Consumes a SOAP API related to scientific articles. Output in console.
- REST: Provides an API of students and their grades. Stored in a H2 in-memory database.

Each subfolder contains its own part of the project.

## gRPC
About the gRPC implementation...

### Installation
Installing the gRPC project is easy. Here's how ...

### Data stores
As part of the solution, the gRPC application writes to ...

## SOAP
About the SOAP implementation...

### Installation
Installing the SOAP project is easy. Here's how ...

## REST
This part of the application provides an API and data store containing students and their grades.

The application was built with Spring Boot and supported by Maven, H2 and JPA. It is extended by the h2 console and the HAL explorer.

### Installation
Dependencies are installed by Maven through the `pom.xml` file.

1) Build project
2) Run `RestApplication.java`
3) Browse the API and database. Query it using the HAL-explorer or Postman.

### Data stores
The application uses the H2 in-memory database as a datastore. The database contains some testdata which is loaded by Spring through the `LoadDatabase.java` class.

### Available endpoints

| HTTP METHOD | URL                                 | Parameter/Body | Notes                                                           |
|-------------|-------------------------------------|----------------|-----------------------------------------------------------------|
| GET         | http://localhost:8080/              |                | HAL Explorer                                                    |
| GET         | http://localhost:8080/h2-console    |                | Browse h2 database. Login details are in application.properties |
| GET         | http://localhost:8080/students      |                | Returns all students                                            |
| GET         | http://localhost:8080/students/{id} | Long id        | Returns student by ID                                           |
| DELETE      | http://localhost:8080/students/{id} | Long id        | Deletes student by ID                                           |
| POST        | http://localhost:8080/students      | Body           | Creates or updates a student.                                   |

Below are some example `Body` fields to include in the POST (createOrUpdate) request:

<details><summary>Creating a new student</summary>

_Do not include `id`_.

```json
{
    "firstName": "John",
    "lastName": "Testman",
    "grades": [
        {
            "subject": "Math",
            "year": "2021",
            "grade": "B"
        },
        {
            "subject": "Home Economics",
            "year": "2021",
            "grade": "A"
        }
    ]
}
```
</details>

<details><summary>Updating an existing student</summary>

_Do include `id` as it matches on this_.

```json
{
    "id":"1",
    "firstName": "John",
    "lastName": "Testman",
    "grades": [
        {
            "subject": "Math",
            "year": "2021",
            "grade": "C"
        },
        {
            "subject": "Home Economics",
            "year": "2021",
            "grade": "C"
        },
         {
            "subject": "newSubject",
            "year": "2021",
            "grade": "A"
        }
    ]
}
```
</details>

## Tools
For testing we used the following:
- BloomRPC
- Postman
- HAL-explorer
- H2-console

## Resources
- https://www.ebi.ac.uk/europepmc/webservices/soap?wsdl 
- https://europepmc.org/docs/EBI_Europe_PMC_Web_Service_Reference.pdf 
- https://stackabuse.com/integrating-h2-database-with-spring-boot/
- https://spring.io/guides/tutorials/rest/ 
- https://www.baeldung.com/spring-boot-h2-database