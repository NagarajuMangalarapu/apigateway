# Use the official OpenJDK image as a base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged jar file into the container (replace with your actual jar name)
COPY target/Microservices-customer-0.0.1-SNAPSHOT.jar /app/Microservices-customer-0.0.1-SNAPSHOT.jar

# Expose the port that the Spring Boot app runs on
EXPOSE 9008

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "Microservices-customer-0.0.1-SNAPSHOT.jar"]
