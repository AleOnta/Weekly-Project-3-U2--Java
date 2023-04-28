package com.fire_sistem.factory;

public interface I_Probe {

	void performDetection();
	
	void propagateAlarm(Probe p, int smokeDetection);
	
}
