const { Client, logger } = require("camunda-external-task-client-js");

// configuration for the Client:
//  - 'baseUrl': url to the Process Engine
//  - 'logger': utility to automatically log important events
const config = { baseUrl: "http://localhost:8080/engine-rest", use: logger };

// create a Client instance with custom configuration
const client = new Client(config);

// susbscribe to the topic: 'topicValidation'
client.subscribe("topicValidation", async function ({ task, taskService }) {
  // Put your business logic
  // complete the task

  const amount = task.variables.get("Amount");
  const debt = task.variables.get("Debt");
  const name = task.variables.get("Name");
  const age = task.variables.get("Age"); //number
  const salary = task.variables.get("Salary"); //long
  const status = task.variables.get("Status"); //

  console.log('amount', amount, typeof(amount))
  console.log('debt', debt, typeof(debt))
  console.log('age', age, typeof(age))
  console.log('salary', salary, typeof(salary))
  console.log('status', status, typeof(status))


  if (name) {
    console.log('length accepted')
    await taskService.complete(task);
  } else {
    console.log('denied')
    // errorMessage?: string | undefined;
    // errorDetails?: string | undefined;
    // retries?: number | undefined;
    // retryTimeout?: number | undefined;
    // await taskService.handleFailure(task, { errorMessage: "Name too short" });
    await taskService.handleBpmnError(task, "Error_0b790gi", "Name too short");
  }
});


client.subscribe("topicCustomer", async function ({ task, taskService }) {
  // Put your business logic
  // complete the task
  //todo
  await taskService.complete(task);
});