package com.fire_sistem.design_patterns;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProbeAndSubjectTester {
	
	ControlCenterProxy controlCenter;
	ProbeChecker probeChecker1, probeChecker2;
	Probe probe;
	
	@BeforeEach
	void setUp() {
		controlCenter = new ControlCenterProxy();
		probe = ProbeFactory.getProbe();
		probeChecker1 = new ProbeChecker(controlCenter);
		probeChecker2 = new ProbeChecker(controlCenter);
	}

	@Test
	void testPerformDetection() {
		probe.performDetection();
		// check that smoke lvl remain in the given range
		assertTrue(probe.getSmokeLevel() < 9);
		assertTrue(probe.getSmokeLevel() >= 0);
	}

	@Test
	void testSubscribeObserver() {
		probe.subscribeObserver(probeChecker1);
		// checking the correct behavior of the observer list
		assertTrue(probe.getProbesObserved().size() > 0);
		assertTrue(probe.getProbesObserved().size() < 2);
	
		// checking the correct behavior of the observer list
		probe.subscribeObserver(probeChecker2);
		assertTrue(probe.getProbesObserved().size() > 1);
		assertTrue(probe.getProbesObserved().size() < 3);
	}

	@Test
	void testUnsubscribeObserver() {
		probe.subscribeObserver(probeChecker1);
		probe.subscribeObserver(probeChecker2);
		// checking the correct behavior of the observer list
		assertEquals(probe.getProbesObserved().size(), 2);
		
		probe.unsubscribeObserver(probeChecker2);
		// checking the correct behavior of the observer list
		assertEquals(probe.getProbesObserved().size(), 1);
		
		probe.unsubscribeObserver(probeChecker1);
		// checking the correct behavior of the observer list
		assertEquals(probe.getProbesObserved().size(), 0);
	}
}
