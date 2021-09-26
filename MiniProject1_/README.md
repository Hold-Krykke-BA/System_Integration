# MiniProject 1

Each subfolder has its own purpose as part of the project.

## gRPC

## SOAP

## REST


### Available endpoints

| HTTP METHOD | URL                                 | Parameter/Body | Notes                                                                                                                                                       |
|-------------|-------------------------------------|-----------|-------------------------------------------------------------------------------------------------------------------------------------------------------------|
| GET         | http://localhost:8080/students      |           | Returns all students                                                                                                                                        |
| GET         | http://localhost:8080/students/{id} | Long id   | Returns student by ID                                                                                                                                       |
| DELETE      | http://localhost:8080/students/{id} | Long id   | Deletes student by ID                                                                                                                                       |
| POST        | http://localhost:8080/students      | Body*     | Creates or updates a student. For updates, ensure to include the "id" field to update the entity. Otherwise it will not match and will create a new entity. |

Below are some example `Body` fields to include in the POST (createOrUpdate) request:

**Creating a new student**

_Do not include `id`_
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

**Updating an existing student**

_Do include `id` as it matches on this_

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