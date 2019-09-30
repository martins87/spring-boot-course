package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm  implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// logic for Bubble sort
		return numbers;
	}
}
