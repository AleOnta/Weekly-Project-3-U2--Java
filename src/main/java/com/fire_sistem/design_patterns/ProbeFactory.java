package com.fire_sistem.design_patterns;

public class ProbeFactory {
	public static int idCounter = 0;
	
	public static Probe getProbe() {
		idCounter += 1;
		return new Probe();
	}
}
