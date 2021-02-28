# Getting Started

### Reference Documentation
For further reference, please consider the following points

Launch the application
======================
Import the EnrolleesAPI application as a maven project

Launch MYSQL and create schema with name enrollment

Make sure database server properties match the application properties inside project

Run the application
========================
Click on terminal go to ENROLLEESAPI folder and execute command mvnw spring-boot:run
or
Right Click on EnrolleesapiApplication.java run as application.

### Guides
The following guides illustrate how to use some features concretely:

Open the browser and click on the below urls

Access Swagger url
=====================
http://localhost:8082/swagger-ui.html

Access Url individually
==========================
Post enrollee (Use postman to insert records to database)
Use the following request body
{
    "enrollees_id": "3",
    "enrollees_name": "Jack",
    "birth_date": "05/20/1993",
    "phone_number": "3464008140",
    "activation_status": "Y",
    "dependents": [
        {
            "dependents_id": 124,
            "dependents_name": "Ramesh",
            "birth_date": "11/12/1991"
        }
    ]
}

http://localhost:8082/api/enrollees/insertEnrollee


Find All enrollee
http://localhost:8082/api/enrollees/getAll

Update enrollee
http://localhost:8082/api/enrollees/updateEnrollee

Delete enrollee
http://localhost:8082/api/enrollees/deleteEnrollee/{id}
Here id can be any data that you inserted into database

Post Dependent (Use postman to insert records to database)
http://localhost:8082/api/dependents/insertDependent


Find All Dependents
http://localhost:8082/api/dependents/getAll

Update Dependent
http://localhost:8082/api/dependents/updateDependent

Delete Dependent
http://localhost:8082/api/dependents/deleteDependent/{id}
Here id can be any data that you inserted into database