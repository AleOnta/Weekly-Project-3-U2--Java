package com.fire_sistem.factory;

import java.util.Locale;
import com.github.javafaker.Faker;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Probe implements I_Probe {
	private static int idCounter = 1;
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
	public void propagateAlarm(Probe p, int smokeDetection) {
		
	}
}
