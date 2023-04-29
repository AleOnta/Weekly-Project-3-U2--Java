package com.fire_sistem.design_patterns;

public class ProbeFactory {
	
	public static Probe getProbe() {
		Probe.idCounter++;
		return new Probe();
	}
}
