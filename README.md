# System Integration Mini Project BPMN
### SOFT2020FALL-SI-GroupProject2
**[Assignment Link](https://datsoftlyngby.github.io/soft2020fall/resources/6f3005f8-MP2-BPMN.pdf)**  
***
#### Author's details
_**Jörg Oertel & Morten Feldt (Team 8)**_
***
#### Brief Summary
This project system regards a messenger service, which is based on **Camunda Modeler** and business rules.  
The process check input for empty requests, and the message is rejected, if empty or blank.  
If the message is more than 5 characters (could be any number), the admin person has to accept those message to be send, if the message is less than 5 characters it would be sent without any human accept task.  
***
#### Installation instructions
1. Clone GitHub project
2. Run **Application** in package **dk.si.bpmn.camunda**  
***
#### User instructions
1. POST http://localhost:8080/engine-rest/process-definition/key/messengerservice/submit-form  
**Header**  
Content-Type | application/json  
**Body**  
{  
  "variables": {  
    "text": {"value":"_TEXT TO SEND_","type":"String"}  
  }  
}  
2. GET http://localhost:8080/engine-rest/task/ (NOTICE, this is human task to accept)  
3. POST http://localhost:8080/engine-rest/task/{processID}}/complete (NOTICE, processID can be found i task list above)  
**Header**  
Content-Type | application/json  
**Body**  
{  
    "variables": {  
        "approver": {"value":"admin"}  
    },  
    "withVariablesInReturn": true  
}  
4. GET http://localhost:8080/engine-rest/external-task (NOTICE, this will show all task completed both with and without human task accept)
***


