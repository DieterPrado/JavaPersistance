# Persistance Java
### Table of contents
- [General info](#general-info)
- [Technologies](#technologies)
- [Setup](#setup)
- [Things learned](#things-learned)
>- JDBC.
>- CRUD.
>- RestApi
>- Gson.
- [Commands](#commands)


------------

### General info

This repository contains files and explanations of things learned in the Platzi's Persistance Java course. The course taught how to create our own databases and send queries from java to create, read, update or delete (CRUD) information. It also taught how to get and store information from public APIs. The CatApp directory contains the CRUD data and catapp directory contains files used to work, get, store and delete information from public APIs.


------------

### Technologies
- NetBeans 12.4
- OpenJDK 8
- MySQL 8.0.25
- Xampp 8.0.7
- PostMan 8.7.0

------------

### Setup

###### NetBeans
-  Go to https://netbeans.apache.org/download/index.html click the donwload button of feature update.
-  Donwload the installer for your OS.
-  Complete de installation process.

###### OpenJDK
- Go to https://adoptopenjdk.net/ and download the following version: OpenJDK 8
- Complete de installation process

##### MYSQL 8.0.25
- Go to https://dev.mysql.com/downloads/connector/j/ and click on "go to download page" button.
- Sign up on oracle and donwload the program.
- Download either web community or community program.
- Complete the installation process.

##### Xampp 8.0.7
- Go to https://www.apachefriends.org/es/index.html 
- Click the donwload button of your OS.
- Complete the installation process.

##### PostMan 8.7.0
- Go to https://www.postman.com/downloads/ and click on the download the app button.
- Complete the installation process.


------------
### Things learned
- JDBC, its an API for Java that manages java connections to databases. Somne classes methods are:
>- DriverManager.getConnection() - Establish and return a connection object.
>- Connection.createStatement() - Returns a statement object to execute SQL statements.
>- Statement.executeQuery() - Execute a SQL SELECT statement and returns a result set object.
>- PreparedStatement() - An object that represents a precompiled SQL statement.
>- ResultSet - A table of data representing a database result set. The ResultSet interface provides getter methods (getBoolean, getLong) for retrieving column values from the current row.

- Connect to MySQL from NetBeans using JDBC.

- Create a database.

- Apply CRUD to our database. It is the acronym for Create, Read, Update and Delete, which is used to refer to basic functions in databases.

- Send querie's from java.

- Where data is stored.

- How to use PostMan.

- API Rest and HTTP methods. A RESTful API is an architectural style for an application program interface (API) that uses HTTP requests to access and use data. 

| ------------ | ------------ |
| Get | Postman, gets information.|
| Post | Postman, stores or send information.|
| Put/Patch | Postman, update or edits information.|
| Delete | Postman, deletes information.|

- API key. A unique identifier used to authenticate a user, developer, or calling program to an API.

- How to get data from public APIs.

- Store, manipulate and show data from public APIs.

- Gson. A Java library that can be used to convert Java Objects into their JSON representation.



------------
### Commands
| Statement | Function  |
| ------------ | ------------ |
| SELECT | SQL syntax, used in sent queries to select the information to be used.   |
| FROM | SQL syntax, used in sent queries to specify from where the information will be obtained. |
| WHERE | SQL syntax, used in sent queries to filter information trhough conditions.|
| UPDATE | SQL syntax, used in sent queries to update the table with new information.|
| DELETE | SQL syntax, used in sent queries to delete information.|


