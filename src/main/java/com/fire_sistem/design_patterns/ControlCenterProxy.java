package com.fire_sistem.design_patterns;

public class ControlCenterProxy implements I_ControlCenter {

	private I_ControlCenter concrete_CC;
	
	public ControlCenterProxy() {
		concrete_CC = ControlCenterFactory.produceControlCentre("http");
	}

	@Override
	public void detectOngoingFire(AlarmInfo alarm) {
		concrete_CC.detectOngoingFire(alarm);
	}
}
