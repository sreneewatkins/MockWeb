package com.tts.mockweb;

import com.tts.mockweb.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/*
The @SpringBootTest annotation tells Spring Boot to look for a main
configuration class (one with @SpringBootApplication, for instance)
and use that to start a Spring application context.
 */
@SpringBootTest
class MockWebApplicationTests {

	/*
	To convince yourself that the context is creating your controller,
	you could add an assertion
	Spring interprets the @Autowired annotation, and the controller is
	injected before the test methods are run. We use AssertJ (which
	provides assertThat() and other methods) to express the test
	assertions.
	 */
	@Autowired
	private HomeController controller;

	/*
	The first thing you can do is write a simple sanity check test
	that will fail if the application context cannot start.
	 */
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
