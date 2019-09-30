package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * The @SpringBootApplication includes the annotations:
 * 	- @EnableAutoConfiguration
 * 	- @ComponentScan
 * 	- @SpringBootConfiguration  
 */
@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{ 12, 4, 6 }, 3);
		System.out.println(result);
	}

}
