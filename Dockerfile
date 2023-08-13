FROM openjdk:11.0.7-jdk-slim
ADD target/netology_spring_boot_1-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]