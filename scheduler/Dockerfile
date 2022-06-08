FROM openjdk:8-jdk-alpine   
EXPOSE 8080 
ADD scheduler/target/birthday-scheduler*.jar birthday-scheduler.jar
ENTRYPOINT [ "java","-jar","/birthday-scheduler.jar" ]
