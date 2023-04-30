package com.fire_sistem.design_patterns;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class ControlCenterFactoryTester {
	
	private String inputString;

	@AfterEach
	void tearDown() throws Exception {
		inputString = "";
	}

	@Test
	void testProduceControlCentreCorrectly() {
		inputString = "http";
		I_ControlCenter controlCenter = ControlCenterFactory.produceControlCentre(inputString);
		// Checking if the returned value by ControlCenterFactory is an instance of passed class
		assertInstanceOf(HTTPControlCenter.class, controlCenter);
	}
	
	@Test
	void testProduceControlCentreWithWrongString() {
		inputString = "Any value not defined in switch case";
		
		// Checking if method return the expected exception with expected message
		RuntimeException e = assertThrows(RuntimeException.class, () -> {
			ControlCenterFactory.produceControlCentre(inputString);
		});
		
		String expectedMessage = "Communication channel not implemented yet";
		String actualMessage = e.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}

}
