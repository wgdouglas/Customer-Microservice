# Customer-MicroService
    This will handle customer registration

# Fraud-MicroService
    Will handle Validation of clients coming from Customer-MicroService

## Software and Framework's used:
- Using Maven, Springboot, Java, Postgres , & Docker

## Information Index:
1. Service Discovery
2. Distributed Tracing
3. Load Balancers
4. Message Queues
5. Rabbit MQ
6. Kafka

## Understanding the Usages:
- This is to understand how to build microservices from the ground up
- Spring Boot will be used to create the Microservices
- Maven for packaging the applications
  - It will allow us to use Maven-MultiModule
  - Allows us to have `SubModules` which lets us choose which dependencies each module needs to import
- Joint Interface Plan utilizing packaging into a JAR then package into Docker image 
& from the image we'll run it into a K8s Cluster
- Use Spring Cloud to bring all the MicroServices together
- Use Docker to build our DB
  - You'll be using Postgres in our DockerFile
- Load Balances:
  - Client --> Internet --> Virtual Machine
  - If your application is receiving heavy traffic you'll need multiple instances of your
  VM to deal with this
  - But your backend system won't know which one to connect to but to solve this we use load balances
  - Using an external Load balencer you can utilize this for your traffic from the internet 
  will be sorted to send request's to your internal load balancer which will handle the requests 
  inside your private network which holds your microservices and internal balancers
  - When running your application its best practice to grab a cloud provider to manage 
  this action of external load balancing

## Project Action Items:

- Set up the needed dependencies in our `pom.xml` & create our subModules
- Build the Customer Microservice
- Create the API for Customer & then connect it to its own Database
  - This will be a Restful API that is created
- Create the next Microservice called `Fraud`
- Have the two Microservices talk to each other 