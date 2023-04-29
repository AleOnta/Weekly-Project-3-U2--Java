package com.fire_sistem.design_patterns;

public class ControlCenterProxy implements I_ControlCentre {

	private I_ControlCentre concrete_CC;
	
	public ControlCenterProxy() {
		concrete_CC = ControlCenterFactory.produceControlCentre("http");
	}

	@Override
	public void detectOngoingFire(AlarmInfo alarm) {
		concrete_CC.detectOngoingFire(alarm);
	}
}
