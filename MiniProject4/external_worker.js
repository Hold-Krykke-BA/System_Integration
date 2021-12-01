const fs = require('fs')
const { Client, logger } = require("camunda-external-task-client-js");
const config = { baseUrl: "http://localhost:8080/engine-rest", use: logger };
const client = new Client(config);

client.subscribe("topicValidation", async function ({ task, taskService }) {
  console.log('inside topicValidation')
  const amount = await task.variables.get("Amount");
  const debt = await task.variables.get("Debt");
  const name = await task.variables.get("Name");
  const SSN = await task.variables.get("SSN");
  const creditScore = await task.variables.get("CreditScore"); //number
  const salary = await task.variables.get("Salary"); //long
  const status = await task.variables.get("Status"); //

  let applicationCheck = false;
  if (amount > 10000 && debt < 100000 && name.length > 3 && SSN.toString().length === 10
    && creditScore > 600 && salary > 20000 && status) {
    applicationCheck = true;
  }

  if (applicationCheck) {
    console.log('Application validated')
    //task.variables.set('Interest', '5%')
    //const variables = await new Variables().set('Interest', '5%');
    await taskService.complete(task);
  } else {
    console.log('Application ´not validated')
    await taskService.handleBpmnError(task, "Error_0b790gi", "Name too short");
  }
});


client.subscribe("topicCustomer", async function ({ task, taskService }) {
  const content = await task.variables.getAll()
  const SSN = await task.variables.get("SSN");

  fs.writeFileSync(`./approved_loans/${SSN}.json`, JSON.stringify(content, null, 2), err => {
    if (err) {
      console.error(err)
      return
    }
  })
  console.log(`Loan aggrement saved as ${SSN}`)
  await taskService.complete(task);
});