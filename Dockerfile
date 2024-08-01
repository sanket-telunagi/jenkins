FROM openjdk:17
EXPOSE 8081
ADD target/ronan.jar ronan.jar
ENTRYPOINT ["java", "-jar", "/ronan.jar"]