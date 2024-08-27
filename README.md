Welcome to SafeHouse. This project is a system for monitoring the condition of the house. It is designed to connect with smart devices and sensors to monitor such things as temperature, humidity, motion, etc.  
Microservice architecture is used in this project. The system consists of several services that are responsible for different tasks.

## Table of Contents:
- [Technology Stack](#technology-stack)
- [Features](#features)
- [Services](#services)

## Technology Stack
- [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot is an open-source Java-based framework used to create microservices.
- [Spring Cloud](https://spring.io/projects/spring-cloud) - Spring Cloud is a set of tools for building and deploying cloud-native applications.
- [Spring Web](https://spring.io/guides/gs/serving-web-content/) - Spring Web is a part of the larger Spring Framework. It is used to build web applications.
- [Spring Security](https://spring.io/projects/spring-security) - Spring Security is a powerful and highly customizable authentication and access-control framework.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Spring Data JPA is a part of the larger Spring Data family. It makes it easy to easily implement JPA-based repositories.
- [PostgreSQL](https://www.postgresql.org/) - PostgreSQL is a powerful, open-source object-relational database system.
- [Jakarta Validation](https://jakarta.ee/specifications/bean-validation/3.1/) - Jakarta Validation is a tool for handling validation in Java.
- [JUnit](https://junit.org/junit5/) - JUnit is a simple framework to write repeatable tests.
- [Lombok](https://projectlombok.org/) - Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.
- [Docker](https://www.docker.com/) - Docker is a set of platform as a service products that use OS-level virtualization to deliver software in packages called containers.
- [Postman](https://www.postman.com/) - Postman is a collaboration platform for API development. Postman's features simplify each step of building an API and streamline collaboration so you can create better APIs

## Features

#### Microservice Architecture
The system consists of several services that are responsible for different tasks.
The services communicate with each other using REST API.

#### 🔒Security
- JWT tokens are used for authentication and authorization.
- Passwords are hashed using BCryptPasswordEncoder.

#### 📂Data Persistence
Data is stored in a PostgreSQL database. The database schema is created automatically by Hibernate. Each service has its own database.

## Services

#### 🌐Gateway Service
The Gateway Service is the entry point for all requests. It routes requests to the appropriate service via URL. It also works like a load balancer.

#### 🔑Auth Service
The Auth Service is responsible for user authentication and authorization. It generates and stores JWT tokens for authenticated users.  

#### 🙋‍♂️User Service
The User Service is responsible for managing users. It provides endpoints for reading and updating user information.

#### 📱Device Service
The Device Service is responsible for managing devices. It provides endpoints for creating, reading, updating, deleting devices and getting information from devices. Devices should connect with this service and send their information.

#### 🏡House Service
The House Service is responsible for managing houses. It provides endpoints for creating, reading, updating, deleting houses. Also monitoring houses condition, request device-service to read devices info. 