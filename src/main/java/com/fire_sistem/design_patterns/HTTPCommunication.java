package com.fire_sistem.design_patterns;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HTTPCommunication extends CommunicationChannel {
	
	private String plainEndpoint;
	
	public HTTPCommunication(String plainEndpoint) {
		this.plainEndpoint = plainEndpoint;
	}
	
	public void HTTPReq(AlarmInfo alarm) {
		log.info("Probe Alarm --> probe: {} | lat: {} | lon: {} | smoke level: {}", alarm.getProbeId(), alarm.getLatitude(), alarm.getLongitude(), alarm.getDetectedSmoke());
		
		String request = plainEndpoint + "?probeid=" + alarm.getProbeId() + "&lat=" + alarm.getLatitude() + "&lon=" + alarm.getLongitude() + "&smokelvl=" + alarm.getDetectedSmoke();
		log.info("Fullfilled call to: " + request);
	}
}
