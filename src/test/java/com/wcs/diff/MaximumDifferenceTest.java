package com.wcs.diff;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaximumDifferenceTest {

	@Test
	void arrayEmpty() {
		
		int list[] = {};
		
		assertEquals(-1, MaximumDifference.maxDifference(list));
	}
	
	@Test
	void arrayNull() {
		
		int list[] = null;
		
		assertEquals(-1, MaximumDifference.maxDifference(list));
	}
	
	@Test
	void arrayOneValue() {
		
		int list[] = {6};
		
		assertEquals(-1, MaximumDifference.maxDifference(list));
	}
	
	@Test
	void maxCaseZero() {
		
		int list[] = {7,2,3,10,2,4,8,1};
		
		assertEquals(8, MaximumDifference.maxDifference(list));
	}
	
	@Test
	void maxCaseOne() {
		
		int list[] = {6,7,9,5,6,3,2};
		
		assertEquals(3, MaximumDifference.maxDifference(list));
	}
	
	@Test
	void maxCaseTwo() {
		
		int list[] = {1,2,6,4};
		
		assertEquals(5, MaximumDifference.maxDifference(list));
	}
	
	
}
