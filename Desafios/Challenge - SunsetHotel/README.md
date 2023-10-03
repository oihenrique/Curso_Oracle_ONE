# Reservation management Challenge - Sunset Hotel

![Java](https://img.shields.io/badge/Java-8%2B-orange)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![Hibernate](https://img.shields.io/badge/Hibernate-Framework-orange)
![Swing](https://img.shields.io/badge/Java%20Swing-red)
[![LinkedIn](https://img.shields.io/badge/Connect%20on-LinkedIn-blue)](https://www.linkedin.com/in/oihenriquegomes/)

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Usage](#usage)
- [Contact](#contact)

## Introduction

The main idea behind the Sunset Hotel project was to create a reservation system that allows for managing hotel reservations and active customers, as well as rooms and system users.

The project is part of the Oracle One Next course, provided by Alura, and aims to implement the CRUD concept using ORM with Hibernate, connecting to a MySQL database, and developing graphical interfaces using Swing. #challengeonealurahotelbr5

![LoginPage](screenshots/runningProjectHotel1.gif)

## Features

- **System CRUD Operations:** Registering users, reservations, guests, and rooms. Also, editing and deleting users, reservations, guests, and rooms.
- **User Interface for System Usage.**
- **User Login.**
- **Secure Password Hashing and Salting using BCrypt.**
- **Integration with MySQL Database** for storing system information.

![FeaturesView](screenshots/runningProjectHotel2.gif)

## Technologies Used

- ![Java](https://img.shields.io/badge/Java-8%2B-orange): Programming language for building the application.
- ![MySQL](https://img.shields.io/badge/MySQL-Database-blue): Database for storing user-related data.
- ![Hibernate](https://img.shields.io/badge/Hibernate-Framework-orange): Framework for simplifying database interaction by mapping Java objects to database tables.
- ![Swing](https://img.shields.io/badge/Java%20Swing-red): Java graphical user interface (GUI) toolkit for building desktop applications.


## Usage
- Configure the database in the files: `persistence.xml` in the "/resources/META-INF" folder and `JPAUtil` inside the "util" folder.
- Access the "view" folder inside the project package folder.
- Run the `LoginPage` class to create the tables in the database.
- Close the window and create a user through the database.
- Run the `LoginPage` again and log in using the user's credentials.


## Contact

Connect with me on [LinkedIn](https://www.linkedin.com/in/oihenriquegomes/).
