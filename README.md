# Testing the Web Layer

https://spring.io/guides/gs/testing-web/

This guide walks you through the process of creating a Spring application and then testing it with JUnit.

### What You Will Build
You will build a simple Spring application and test it with JUnit. You 
probably already know how to write and run unit tests of the individual 
classes in your application, so, for this guide, we will concentrate on 
using Spring Test and Spring Boot features to test the interactions 
between Spring and your code. You will start with a simple test that the 
application context loads successfully and continue on to test only the 
web layer by using Spring’s MockMvc.

### 1 - Starting with Spring Initializr
This example needs only the Spring Web dependency.
You can get a Maven build file with the necessary dependencies directly 
from the Spring Initializr - pom.xml
You can get a Gradle build file with the necessary dependencies directly 
from the Spring Initializr - build.gradle

### 2 - Create a Simple Application
Create a new controller for your Spring application - HomeController.java

### 3 - Run the Application
The Spring Initializr creates an application class 
(a class with a main() method) for you. For this guide, you need not 
modify this class - MockWebApplication.java

### 4 - Test the Application
Now that the application is running, you can test it. You can load the 
home page at http://localhost:8080. However, to give yourself more 
confidence that the application works when you make changes, you want 
to automate the testing.

Spring Boot assumes you plan to test your application, so it adds the 
necessary dependencies to your build file (build.gradle or pom.xml).

1) The first thing you can do is write a simple sanity check test that 
   will fail if the application context cannot start - MockWebApplicationTests.java
2) It is nice to have a sanity check, but you should also write some 
   tests that assert the behavior of your application. To do that, you 
   could start the application and listen for a connection (as it would 
   do in production) and then send an HTTP request and assert the 
   response. HttpRequestTest.java  
3) Another useful approach is to not start the server at all but to test only 
   the layer below that, where Spring handles the incoming HTTP request and 
   hands it off to your controller. That way, almost of the full stack is used, 
   and your code will be called in exactly the same way as if it were processing 
   a real HTTP request but without the cost of starting the server. To do that, 
   use Spring’s MockMvc and ask for that to be injected for you by using the 
   @AutoConfigureMockMvc annotation on the test case. MockControllerTest.java
4) We can narrow the tests to only the web layer by using @WebMvcTest - WebLayerTest.java
5) So far, our HomeController is simple and has no dependencies. We could make 
   it more realistic by introducing an extra component to store the greeting 
   (perhaps in a new controller) - GreetingController.java
6) Then create a greeting service - GreetingService.java - Spring automatically 
   injects the service dependency into the controller (because of the 
   constructor signature). Then test this controller.
   
# Summary
Congratulations! You have developed a Spring application and tested it with 
JUnit and Spring MockMvc and have used Spring Boot to isolate the web layer 
and load a special application context.