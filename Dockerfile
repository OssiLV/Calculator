# Stage 1: Build Java app using Maven
FROM maven:3.9.5-eclipse-temurin-17 AS builder

# Tạo thư mục làm việc
WORKDIR /app

# Copy source code vào container
COPY . .

# Build JAR file
RUN mvn clean package -DskipTests

# Stage 2: Run the app
FROM eclipse-temurin:17-jdk-alpine

# Tạo thư mục app
WORKDIR /app

# Copy file JAR từ stage build sang
COPY --from=builder /app/target/Calculator-1.0-SNAPSHOT.jar app.jar

# Command để chạy ứng dụng
CMD ["java", "-jar", "app.jar"]
