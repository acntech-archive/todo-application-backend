# Todo application backend

This application provides a back end service for our [todo-list example application](https://github.com/acntech/todo-application-frontend).
It's based on Spring Boot Data and exposes CRUD operations via REST endpoints.

## Build and run

The application has an embedded Tomcat server and can be run in your IDE, with `java -jar` or using Docker.
Using any of the methods below on your local machine should make the service available on `http://localhost:8080/rest/todos`

### Run from IDE

You should be able to launch the application from your IDE by running the main method in TodoListApplication.java.

### Package and run as .jar file

We're using Maven for building and packaging. Build the application using `mvn clean install`.
After it's built you can run the .jar file located in your target folder `java -jar target/todo-application-*.jar`

### Run with Docker

Docker can be used to package the .jar file from the Maven build into a runnable Docker image.
The image can be deployed to your local machine or a server in any cloud environment.

Build the image: `docker build -t todo-application-backend .`

Then run it with `docker run -d -p 8080:8080 todo-application-backend`
