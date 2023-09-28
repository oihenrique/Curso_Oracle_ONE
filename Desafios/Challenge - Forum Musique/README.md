# Desafio API - Forum Musique

![Java](https://img.shields.io/badge/Java-8%2B-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-blue) ![Spring Security](https://img.shields.io/badge/Spring%20Security-6-green) [![LinkedIn](https://img.shields.io/badge/Connect%20on-LinkedIn-blue)](https://www.linkedin.com/in/gustavo-ruiz-810a851b5/)
![GPL License](https://img.shields.io/badge/License-GPL-blue)

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contact](#contact)

## Introduction

This project aims to implement API concepts, API security, HTTP requests, and user authentication. Therefore, it can be used for studying the application of these concepts through code.

## Features

- Forum CRUD operations: create users, topics and replies. Also, editing and deleting users/topics/replies.
- Login with JWT-based authentication.
- Role-based authorization for controlling user access to different functions of the application.
- Secure password hashing and salting using BCrypt.
- Integration with MySQL database for storing forum information.

## Technologies Used

- ![Java](https://img.shields.io/badge/Java-8%2B-orange): Programming language for building the application.
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green): Framework for creating production-ready Spring applications.
- ![Spring Boot](https://img.shields.io/badge/Spring%20Data-2023.0.4-green): Framework for simplify database access and provide higher-level programming model for data repositories.
- ![Spring Security](https://img.shields.io/badge/Spring%20Security-6-green): Framework for securing Spring applications.
- ![JWT](https://img.shields.io/badge/JWT-JSON%20Web%20Token-yellow): Token-based authentication using JSON Web Tokens.
- ![MySQL](https://img.shields.io/badge/MySQL-Database-blue): Database for storing user-related data.
- ![Lombok](https://img.shields.io/badge/Lombok-red): Library that simplifies code by automating repetitive tasks like getters, setters, and constructors.
- ![Flyway](https://img.shields.io/badge/Flyway-Migrations-red): Database migration tool that simplifies version control and management of database schemas.

## Usage

1. **Register a new user** by making a `POST` request to the `/user` endpoint.
2. **Obtain a token** by logging in through the `POST` request to the `/auth/login` endpoint.
3. **Include the token** in the header parameter "Authorization" when accessing protected endpoints to ensure authorized access.
4. Feel free to utilize the other available API endpoints.

## Endpoints

- `POST /user`: Register a new user.
- `GET /user`: List all active users.
- `GET /user/{id}`: Detail information from user selected by id.
- `PUT /user/{id}`: Update information from user selected by id.
- `DELETE /user/{id}`: Deactivate information from user selected by id.

- `POST /auth/login`: Obtain a JWT by logging in.


## Contact

Connect with me on [LinkedIn](https://www.linkedin.com/in/oihenriquegomes/).
