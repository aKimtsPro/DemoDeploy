FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
COPY . /app
WORKDIR /app
RUN mvn package -DskipTests

FROM eclipse-temurin:17-alpine
COPY --from=build /app/target/deploy-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "/app.jar"]
