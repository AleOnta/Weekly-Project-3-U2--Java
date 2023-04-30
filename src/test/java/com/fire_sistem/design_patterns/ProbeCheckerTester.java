package com.fire_sistem.design_patterns;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProbeCheckerTester {

	private ControlCenterProxy controlCenter;
	
	@BeforeEach
	void setUp() {
		controlCenter = new ControlCenterProxy();
	}
	
	@Test
	void testProbeChecker() {
		
		ProbeChecker probeChecker1 = ProbeFactory.getChecker(controlCenter);
		ProbeChecker probeChecker2 = ProbeFactory.getChecker(controlCenter);
		ProbeChecker probeChecker3 = ProbeFactory.getChecker(controlCenter);
		assertTrue(probeChecker1.getId() > 0 && probeChecker1.getId() < 2);
		assertTrue(probeChecker2.getId() > 1 && probeChecker1.getId() < 3);
		assertTrue(probeChecker3.getId() > 2 && probeChecker1.getId() < 4);
	}

}
