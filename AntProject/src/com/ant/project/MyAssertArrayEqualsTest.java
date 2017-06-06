package com.ant.project;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyAssertArrayEqualsTest {

	@Test
	public void myTestMethod() {
		/**
		 * we are demonstrating the usage of assertArrayEquals() method here, so
		 * we are preparing input data here itself. In real scenario, we will
		 * consider the methods returned value which suppose to be test, as a
		 * input.
		 */
		// assume that the below array represents expected result
		String[] expectedOutput = { "apple", "mango", "grape" };
		// assuem that the below array is returned from the method
		// to be tested.
		String[] methodOutput = { "apple", "mango", "grape" };
		assertArrayEquals(expectedOutput, methodOutput);
	}

}
