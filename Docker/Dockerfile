FROM openjdk:8-jdk

ADD notes-backend-1.0.0.jar notes-backend-1.0.0.jar

RUN sh -c 'touch /notes-backend-1.0.0.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/notes-backend-1.0.0.jar"]
