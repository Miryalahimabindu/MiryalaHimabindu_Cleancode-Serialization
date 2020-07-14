package com.epam.interesttask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

 public class TestInterest 
{
	 @Test
		public void test() {
		Calculate c = new Calculate();
			
			// Calculate Simple Interest
			double answer = c.simpleInterest(500, 20, 5);
			assertEquals(500.0, answer,0.001);
			
			
			// Calculate Compound Interest
			answer = c.compoundInterest(500, 10, 2);
			assertEquals(105.000,answer,0.001);
		}
	}
