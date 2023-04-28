package com.fire_sistem.factory;

public class ProbeFactory {
	
	public static Probe getProbe() {
		Probe.idCounter++;
		return new Probe();
	}
}
