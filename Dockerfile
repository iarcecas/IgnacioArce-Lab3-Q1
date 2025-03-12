FROM openjdk:21
ADD target/IgnacioArce-Lab3-Q1-0.0.1-SNAPSHOT.jar IgnacioArce-Lab3-Q1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/IgnacioArce-Lab3-Q1-0.0.1-SNAPSHOT.jar"]
