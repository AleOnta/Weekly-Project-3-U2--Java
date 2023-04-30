package com.fire_sistem.design_patterns;

public class ProbeFactory {
	public static int idCounter = 0;
	
	public static Probe getProbe() {
		idCounter++;
		return new Probe();
	}
	
	public static ProbeChecker getChecker(I_ControlCenter CC) {
		return new ProbeChecker(CC);
	}
}
