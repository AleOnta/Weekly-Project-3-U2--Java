package com.fire_sistem.design_patterns;

public class ControlCentreProxy implements I_ControlCentre {

	private I_ControlCentre concrete_CC;
	
	public ControlCentreProxy() {
		concrete_CC = ControlCentreFactory.produceControlCentre("http");
	}

	@Override
	public void detectOngoingFire(AlarmInfo alarm) {
		concrete_CC.detectOngoingFire(alarm);
	}
}
