<<<<<<< HEAD
FROM openjdk:21

ADD target/spring-devops.jar spring-devops.jar

ENTRYPOINT ["java", "-jar", "/spring-devops.jar"]
=======
FROM openjdk:21
ADD target/spring-devops.jar spring-devops.jar
ENTRYPOINT ["java", "-jar", "/spring-devops.jar"]
>>>>>>> 87d1683dd943290d9f325e25f0337651b63e2d68
