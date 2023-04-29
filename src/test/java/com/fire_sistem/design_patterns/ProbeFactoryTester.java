package com.fire_sistem.design_patterns;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProbeFactoryTester {

	@Test
	void testGetProbe() {
		Probe probe1 = ProbeFactory.getProbe();
		// Check that probeFactory method return an instance of Probe class
		assertInstanceOf(Probe.class, probe1);
		
		// Check that each instance of probe class has a different / unique ID 
		Probe probe2 = ProbeFactory.getProbe();
		assertNotEquals(probe1, probe2);
		assertNotEquals(probe1.getId(), probe2.getId());
	}

}
