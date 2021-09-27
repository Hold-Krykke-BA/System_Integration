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
We have implemented gRCP the same way we did it in the first class assignment and have testet it with bloomRPC. It's a very simple and basic implementation, as there is a lot of framework/dependency issues when doing it this way. We suspect that an easier way to implement gRPC would be to create a protofile and complie it, but due to time constraints and the fact that we haven't been taught this way yet. 
  
**The gRPC call takes four parameters, all Strings, calculates the studypoints, saves the info in a .txt file and returns a response:**
```json
gRPC request
{
  "studentID": "as999",
  "assignmentID": "a2",
  "assignmentCompleted": "1",
  "reviewCompleted": "0"
}

gRPC response
{
  "archivedInfo": "0 studypoints assigned to as999"
}

example on saved file:
AssignmentID Assignment Review Studypoints
    1           true     true      15
    2           true     true      15
    3           true     false     10
```

### Installation
Pull the project and solve any complaints Intellij might have about the dependencies/framework by cleaning in the maven lifecycle, generate source and update folders or restarting the project. Run the program from the main method in the buildserver and test it via BloomRPC. 

## SOAP
The SOAP consumer uses to external SOAP services and contains two applications - a calculator service and a library service. Both of them are operated as console programs in the IDE, as they are just proof of concept. 

SOAP services:
* The calculator service
    * http://www.dneonline.com/calculator.asmx?wsdl
* The library service 
    * https://www.ebi.ac.uk/europepmc/webservices/soap?wsdl

```
Free and shitty SOAP School calculator
Choose operator:
1) Add
2) Subtract
3) Multiply
4) Integer division
5) Exit                                 example input: 3

Enter first number in calculation       example input: 4
Enter second number in calculation      example input: 4
Result is: 16

---------------------------------------------------

Free and shitty SOAP School Scientific Paper Lookup
Choose search term:                     example input: her2

SEARCH RESULT:

DOI: 10.1080/19932820.2021.1955462
Title: HER2 overexpression is a putative diagnostic and prognostic biomarker for late-stage colorectal cancer in North African patients.
Journal Title: Libyan J Med
Publication Year: 2021

DOI: 10.1080/14756366.2021.1948841
Title: Design, synthesis, HER2 inhibition and anticancer evaluation of new substituted 1,5-dihydro-4,1-benzoxazepines.
Journal Title: J Enzyme Inhib Med Chem
Publication Year: 2021

(...)
```

### Installation
Pull the project, all dependencies are installed by maven during/before build. Run the applications in the console through the `SoapApplication` and `Soap2Application` main methods. 

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
