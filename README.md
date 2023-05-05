# SECTION 1

## MAVEN WRAPPER

Each spring initializer project comes with a maven wrapper which can be used to run maven commands without it being
installed in the system

1. `./mvnw package # used to create a packaged java file which can be run using java -jar and is stored in the target directory`
2. `./mvnw spring-boot:run # used to run spring boot app from the CLI`

## Some Starter Packages

1. spring-boot-devtools: a package like nodemon, auto reloading on code update
2. spring-boot-starter-actuator: exposes useful endpoints that helps in app performance monitoring
3. spring-boot-starter-security: used to add an authentication layer

## To inject custom properties from application.properties

1. define the custom property you want
2. use  `@Value("${app.user.name}")` like this on top of a class variable

## Core Properties to Setup a Spring Server
### 1. Logging 
   1. logging properties allows us to control and print messages based on their level per package
   2. we can also write logs to a file
### 2. Web Properties
   1. allows us to setup port (default is 8080)
   2. can change the base url of an application (context path)
   3. session timeout 
### 3. Actuator Properties
   1. including and excluding endpoints
   2. can change the base url/path
### 4. Security Properties
   1. setting default username & password
### 5. Data Properties
   1. Setting up database configuration