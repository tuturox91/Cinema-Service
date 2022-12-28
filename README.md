# Cinema Service

A RESTful cinema service, where you can search movies and movies sessions.
<br>As a user, you can add tickets to shopping cart and affter purchase them.
<br>As admin you can manage data records in database.

## Features 

* Login/logout users
* Register new Usrts
* Roles with rights: User/Admin
* User right:
  * Request:
    * Own orders
    * Own cart
    * Available movie sessions
    * List of cinema halls
    * Lst of movies
* Admin rights:
  * Request:
    * List of cinema halls
    * Lst of movies
    * Available movie sessions
    * Users by email
  * Add:
    * Cinema halls
    * Movies
    * Movie sessions
  * Update:
    *  Movie sessions
  * Delete:
    * Movie sessions
* Data encryption
* Login/register validation

## Technologies
* JDK 17
* Spring Core, Spring Web, Spring Security
* JPA, Hibernate
* Apache Maven
* MySQL 8
* Tomcat 9

## Project structure

The project is divided into several logical levels:
  * `@RestController:` Reads **POST/GET** requests and use autowired **services, mappers** and **DTO** for create and return response.
  * `@Service:` Interacts with **DAO** level and contains business logic.
  * `@Repository` or **DAO** level: interacts with database.

### DB/Model structure
![img.png](img.png)

## Setup guide

You can find setup guide in guthub [wiki](https://github.com/tuturox91/Cinema_RESTful_Service/wiki "wiki").
   
