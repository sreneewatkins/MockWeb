package com.tts.mockweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication is a convenience annotation that adds all of the
following:

@Configuration: Tags the class as a source of bean definitions for the
application context.
@EnableAutoConfiguration: Tells Spring Boot to start adding beans based
on classpath settings, other beans, and various property settings.
@EnableWebMvc: Flags the application as a web application and activates
key behaviors, such as setting up a DispatcherServlet. Spring Boot adds
it automatically when it sees spring-webmvc on the classpath.
@ComponentScan: Tells Spring to look for other components, configurations,
and services in the the com.example.testingweb package, letting it find
the HelloController class.
 */
@SpringBootApplication
public class MockWebApplication {

	/*
	The main() method uses Spring Boot’s SpringApplication.run() method
	to launch an application. Did you notice that there is not a single
	line of XML? There is no web.xml file, either. This web application
	is 100% pure Java and you did not have to deal with configuring any
	plumbing or infrastructure. Spring Boot handles all of that for you.
	 */
	public static void main(String[] args) {

		SpringApplication.run(MockWebApplication.class, args);
	}

}
