package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.stereotype.Component;

// @Component defines the class as a Bean
@Component
public class BinarySearchImpl {
	
//	SortAlgorithm is a dependency, so it needs to be wired
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		// Search the array
		
		return 10;
	}
	
}
