package com.fire_sistem.factory;

import java.util.Locale;
import com.github.javafaker.Faker;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Probe implements I_Probe {
	public static int idCounter = 0;
	private static Faker fake = Faker.instance(new Locale("it-IT"));

	private int id;
	private String longitude = fake.address().longitude();
	private String latitude = fake.address().latitude();
	
	
	@Override
	public void performDetection() {
		int smokeDetection = fake.number().numberBetween(0, 8);
		if (smokeDetection >= 5) {
			propagateAlarm(this, smokeDetection);
		} else {
			log.info("Detected smoke level of --> " + smokeDetection + " at probe with ID --> " + this.id);
		}
	}

	@Override
	public Alarm propagateAlarm(Probe p, int smokeDetection) {
		return new Alarm(p.id, p.latitude, p.longitude, smokeDetection);
	}
}
