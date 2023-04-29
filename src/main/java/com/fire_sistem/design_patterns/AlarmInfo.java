package com.fire_sistem.design_patterns;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlarmInfo {
	private int probeId;
	private String longitude;
	private String latitude;
	private int detectedSmoke;
	
	public AlarmInfo(Probe probe) {
		this.probeId = probe.getId();
		this.longitude = probe.getLongitude();
		this.latitude = probe.getLatitude();
		this.detectedSmoke = probe.getSmokeLevel();
	}
}
