FROM maven:3.9-eclipse-temurin-11 AS build
WORKDIR /workspace
COPY pom.xml ./
COPY ms-product-service/pom.xml ms-product-service/pom.xml
COPY ms-supplier-service/pom.xml ms-supplier-service/pom.xml
COPY ms-invoice-service/pom.xml ms-invoice-service/pom.xml
COPY ms-auth-service/pom.xml ms-auth-service/pom.xml
COPY ms-api-gateway/pom.xml ms-api-gateway/pom.xml
COPY ms-platform/pom.xml ms-platform/pom.xml
COPY ms-api-gateway/src ms-api-gateway/src
RUN mvn -q -f pom.xml -pl ms-api-gateway -am -DskipTests package
FROM eclipse-temurin:11-jre
WORKDIR /app
COPY --from=build /workspace/ms-api-gateway/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
