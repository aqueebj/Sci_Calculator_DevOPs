FROM openjdk:8
COPY ./target/Sci-Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "Sci-Calculator-1.0-SNAPSHOT.jar", "Main"]