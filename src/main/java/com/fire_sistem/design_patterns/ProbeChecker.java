package com.fire_sistem.design_patterns;

import lombok.Getter;

public class ProbeChecker implements Observer {
	// static properties of class
	private static int idCounter = 1;
	
	// properties of each instance
	@Getter
	private final int id;
	private I_ControlCenter controlCentre;
	
	// constructor
	protected ProbeChecker(I_ControlCenter CC) {
		this.id = idCounter;
		this.controlCentre = CC;
		idCounter++;
	}
	
	// observer interface method
	@Override
	public void update(Subject obj) {
		Probe castedProbe = (Probe) obj;
		AlarmInfo alarm = new AlarmInfo(castedProbe);
		controlCentre.detectOngoingFire(alarm);
	}
}
