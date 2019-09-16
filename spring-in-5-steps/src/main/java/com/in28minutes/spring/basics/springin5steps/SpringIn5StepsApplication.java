package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The @SpringBootApplication includes the annotations:
 * 	- @EnableAutoConfiguration
 * 	- @ComponentScan
 * 	- @SpringBootConfiguration  
 */
@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch =  new BinarySearchImpl();
		int result = binarySearch.binarySearch(new int[]{ 124, 6 }, 3);
		
		System.out.println(result);
		
		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
