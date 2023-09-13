FROM openjdk:17
EXPOSE 8080
ADD target/helloloit.jar helloloit.jar
ENTRYPOINT ["java", "-jar", "/helloloit.jar"]