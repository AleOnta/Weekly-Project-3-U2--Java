package com.fire_sistem.factory;

public interface I_Probe {

	void performDetection();
	
	Alarm propagateAlarm(Probe p, int smokeDetection);

}
