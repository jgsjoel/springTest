# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the application's JAR file to the container
COPY target/mcomapi-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the application will run on
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]