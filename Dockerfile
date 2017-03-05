FROM openjdk:8-jre

EXPOSE 8080
WORKDIR /apps
CMD [ "java", "-jar", "todo-application.jar" ]

COPY target/todo-application-*.jar /apps/todo-application.jar
