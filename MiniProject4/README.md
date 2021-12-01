# MiniProject 4

## Contributors
- _[Rúni Vedel Niclasen - cph-rn118](https://github.com/Runi-VN)_
- _[Camilla Jenny Valerius Staunstrup - cph-cs340](https://github.com/Castau)_

## [Assignment Description](https://datsoftlyngby.github.io/soft2021fall/resources/dd5c5e7a-A11-MP-BPMA.pdf)

## Process
We had a lotof trouble with understandig how Camunda works as we found the documentation very confusing. We decided to take a simple approach in hopes of getting a better grasp on Camunda an chose a [javascrip library](https://github.com/camunda/camunda-external-task-client-js) in order to work with the Camunda-tasks.  

Out implementation in JavaScript is very basic as we couldn't figure out how to update the task variables before the assignment-deadline. This is something we very much would like feedback on in peergrade if anyone else have found a way to do this (dosen't have to be in JavaScript). 

## Results
Our camunda model and forms can be found here:
- [Model](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/MiniProject4/bpmn%20moddel/bankmodel.bpmn)
- [Forms](https://github.com/Hold-Krykke-BA/System_Integration/tree/main/MiniProject4/forms)

### Code
We have two very basic listeners in the [external_worker.js](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/MiniProject4/external_worker.js). One listening for the for the startevent to check the client input. It is in this part we would have liked to add additional variables to the task object. The last listener is listening for the customers approval and saves the loan agreement. 

### Screenshots
**MODEL**  
![image](https://user-images.githubusercontent.com/35559774/144232337-8c172e26-17aa-4699-907d-bbfbbd01e3ed.png)  

**APPLICATION-FORM**  
![image](https://user-images.githubusercontent.com/35559774/144232456-9eef027e-4b57-4d8d-bc0f-ee560b828b54.png)  

**BANK-REVIEW-FORM** (*Cut of due to fit in imgage frame*)  
![image](https://user-images.githubusercontent.com/35559774/144233314-96545719-2995-4ac5-adf0-71ed7eb41d84.png)  

**BANK-REVIEW-DIAGRAM**  
![image](https://user-images.githubusercontent.com/35559774/144233444-7cbbf732-2d4a-4c82-99e7-8812c0269238.png)  

**CUSTOMER-REVIEW-FORM** (*Cut of due to fit in imgage frame*)  
![image](https://user-images.githubusercontent.com/35559774/144233578-0ea7a98c-8012-4f50-9204-aebe7d1b8fbf.png)  

**CUSTOMER-REVIEW-DIAGRAM**  
![image](https://user-images.githubusercontent.com/35559774/144233639-9ab3a0f7-3987-4625-be94-b8fab7e24fa0.png)

After the process is complete, the Loan Agreement is saved in the folder [/approved_loans](https://github.com/Hold-Krykke-BA/System_Integration/tree/main/MiniProject4/approved_loans) under the customers SSN, in JSON format:  
```JSON
  {
    "Status": "Married",
    "Interest": "3%",
    "Salary": 39000,
    "Payment": "1050",
    "Debt": 0,
    "bank_approve": "Approve",
    "client_approve": "Approve",
    "Amount": 150000,
    "Duration": "70",
    "CreditScore": 680,
    "Name": "Rúni Niclasen",
    "SSN": 2308974444
  }
```

## To run this assignment 
1) Clone this repository  
2) Run `docker run -d --name camunda -p 8080:8080 camunda/camunda-bpm-platform:latest`
3) Open the [bankmodel.bpmn](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/MiniProject4/bpmn%20moddel/bankmodel.bpmn) in Camunda Modeler
4) Start the [external_worker.js](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/MiniProject4/external_worker.js) 
5) Deploy the model to `http://localhost:8080/engine-rest` **N.B.:** be sure to include the three forms [apply.form](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/MiniProject4/forms/apply.form), [loan.form](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/MiniProject4/forms/loan.form), [offer.form](https://github.com/Hold-Krykke-BA/System_Integration/blob/main/MiniProject4/forms/offer.form)
6) Start the process by clicking on ![image](https://user-images.githubusercontent.com/35559774/144235248-4b5d6337-d1e1-424d-ac93-b760d033cb02.png)
 in `http://localhost:8080/camunda/app/tasklist/` and choose `BankModelv1`

## Resources
[github.com/camunda/camunda-external-task-client-js](https://github.com/camunda/camunda-external-task-client-js)

