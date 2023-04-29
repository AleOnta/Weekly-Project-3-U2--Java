package com.fire_sistem.design_patterns;

public class HTTPControlCentre implements I_ControlCentre {

	private HTTPCommunication relatedCommunicationChannel;
	private final String plainEndpoint = "http://fire_department/alarm";
	
	public HTTPControlCentre() {
		this.relatedCommunicationChannel = new HTTPCommunication(plainEndpoint);
	}
	
	@Override
	public void detectOngoingFire(AlarmInfo alarm) {
		relatedCommunicationChannel.HTTPReq(alarm);
	}

}
