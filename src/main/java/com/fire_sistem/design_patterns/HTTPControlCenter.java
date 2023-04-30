package com.fire_sistem.design_patterns;

public class HTTPControlCenter implements I_ControlCenter {

	private HTTPCommunication relatedCommunicationChannel;
	private final String plainEndpoint = "http://fire_department/alarm";
	
	public HTTPControlCenter() {
		this.relatedCommunicationChannel = new HTTPCommunication(plainEndpoint);
	}
	
	@Override
	public void detectOngoingFire(AlarmInfo alarm) {
		relatedCommunicationChannel.HTTPReq(alarm);
	}

}
