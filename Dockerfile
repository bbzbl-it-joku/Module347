FROM openjdk:21-jdk-slim

WORKDIR /app

RUN apt-get update && apt-get install -y maven 

RUN apt-get install -y git

COPY pom.xml .
COPY src src
RUN mvn dependency:go-offline

RUN mvn clean package