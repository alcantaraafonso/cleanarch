FROM openjdk:17-alpine

ADD target/cleanarch-0.0.1-SNAPSHOT.jar cleanarch-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", "-jar", "cleanarch-0.0.1-SNAPSHOT.jar" ]