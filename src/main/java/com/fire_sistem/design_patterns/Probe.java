package com.fire_sistem.design_patterns;

import java.util.Locale;
import com.github.javafaker.Faker;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Probe extends Subject implements I_Probe {
	
	// static properties of the class
	public static int idCounter = 0;
	public static final int smokeLimit = 5;
	private static Faker fake = Faker.instance(new Locale("it-IT"));

	// properties of each instance
	private int id;
	private String longitude = fake.address().longitude();
	private String latitude = fake.address().latitude();
	private int smokeLevel = 0;
		
	@Override
	public void performDetection() {
		// generate random value as smoke detected
		int smokeDetection = fake.number().numberBetween(0, 8);
		this.smokeLevel = smokeDetection;
		
		if (smokeDetection >= smokeLimit) {
			super.notifyControlCentre();
		} else {
			log.info("Detected smoke level of --> " + smokeDetection + " at probe with ID --> " + this.id + " | STATUS: OKAY");
		}
	}
}
