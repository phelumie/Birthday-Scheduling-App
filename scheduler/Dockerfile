FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/scheduler-0.0.1-SNAPSHOT.jar scheduler-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/scheduler-0.0.1-SNAPSHOT.jar" ]
