FROM java:8-jre

ADD ./target/theatre-Service-0.0.1-SNAPSHOT.jar /usr/src/theatre-Service-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "theatre-Service-0.0.1-SNAPSHOT.jar"]