const { Client, logger } = require("camunda-external-task-client-js");

// configuration for the Client:
//  - 'baseUrl': url to the Process Engine
//  - 'logger': utility to automatically log important events
const config = { baseUrl: "http://localhost:8080/engine-rest", use: logger };

// create a Client instance with custom configuration
const client = new Client(config);

client.subscribe("topicValidation", async function ({ task, taskService }) {

  const amount = task.variables.get("Amount");
  const debt = task.variables.get("Debt");
  const name = task.variables.get("Name");
  const age = task.variables.get("Age"); //number
  const salary = task.variables.get("Salary"); //long
  const status = task.variables.get("Status"); //

  // task.variables.set("Interest", "5%")
  // task.variables.set("Duration", "10 years")
  // task.variables.set("Payment", "2000 DKK")



  // console.log(task.variables.get("Interest"))
  // console.log(task.variables.get("Duration"))
  // console.log(task.variables.get("Payment"))

  // console.log('amount', amount, typeof(amount))
  // console.log('debt', debt, typeof(debt))
  // console.log('age', age, typeof(age))
  // console.log('salary', salary, typeof(salary))
  // console.log('status', status, typeof(status))



  if (name) {
    console.log('length accepted')
    await taskService.complete(task);
  } else {
    console.log('denied')
    await taskService.handleBpmnError(task, "Error_0b790gi", "Name too short");
  }
});


// client.subscribe("topicCreate", async function ({ task, taskService }) {
//   const amount = task.variables.get("Amount");
//   const debt = task.variables.get("Debt");
//   const name = task.variables.get("Name");
//   const age = task.variables.get("Age"); //number
//   const salary = task.variables.get("Salary"); //long
//   const status = task.variables.get("Status"); //

//   console.log('amount', amount, typeof (amount))
//   console.log('debt', debt, typeof (debt))
//   console.log('age', age, typeof (age))
//   console.log('salary', salary, typeof (salary))
//   console.log('status', status, typeof (status))
//   console.log('***********')
//   console.log(task.variables.get("Interest"))
//   console.log(task.variables.get("Duration"))
//   console.log(task.variables.get("Payment"))
//   await taskService.complete(task);
// });


client.subscribe("topicCustomer", async function ({ task, taskService }) {
  const amount = task.variables.get("Amount");
  const debt = task.variables.get("Debt");
  const name = task.variables.get("Name");
  const age = task.variables.get("Age"); //number
  const salary = task.variables.get("Salary"); //long
  const status = task.variables.get("Status"); //

  console.log('amount', amount, typeof (amount))
  console.log('debt', debt, typeof (debt))
  console.log('age', age, typeof (age))
  console.log('salary', salary, typeof (salary))
  console.log('status', status, typeof (status))
  console.log('***********')
  console.log(task.variables.get("Interest"))
  console.log(task.variables.get("Duration"))
  console.log(task.variables.get("Payment"))
  await taskService.complete(task);
});