FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /app

COPY . .

RUN mvn clean install -pl user-service -am -DskipTests

FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY --from=build /app/user-service/target/user-service*.jar app.jar

ENV DB_HOST=localhost
ENV DB_PORT=5432
ENV DB_NAME=jenkins
ENV DB_USER=jenkins
ENV DB_PASSWORD=1234321
ENV HIKARI_MAX_POOL_SIZE=10
ENV HIKARI_CONNECTION_TIMEOUT=30000

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]
