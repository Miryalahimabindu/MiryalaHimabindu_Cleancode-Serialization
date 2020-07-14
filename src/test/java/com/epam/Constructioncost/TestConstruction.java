package com.epam.Constructioncost;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestConstruction {

	@Test
	public void test() {
		Construction c = new Construction();
		double answer = c.costForConstruction("St", 500, false);
		assertEquals(6000000,answer,0.001);
	}

}
