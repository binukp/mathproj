FROM openjdk:8
ADD target/mathproj-0.0.1-SNAPSHOT.jar /tmp/mathproj.jar
WORKDIR /tmp
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "mathproj.jar"]