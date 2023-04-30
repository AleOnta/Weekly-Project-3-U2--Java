package com.fire_sistem.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.fire_sistem.design_patterns.ControlCenterProxy;
import com.fire_sistem.design_patterns.Probe;
import com.fire_sistem.design_patterns.ProbeChecker;
import com.fire_sistem.design_patterns.ProbeFactory;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class FireSystemRunner implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		log.info("--- Initializing the National Fire System Program ---");
		log.info("*program correctly initilized*");
		log.info("");
		
		// creating a national fire control station
		ControlCenterProxy NationalControlCenter = new ControlCenterProxy();
		
		// creating a probechecker for each probe that will be created
		ProbeChecker northernChecker = ProbeFactory.getChecker(NationalControlCenter);
		ProbeChecker westernChecker = ProbeFactory.getChecker(NationalControlCenter);
		ProbeChecker southernChecker = ProbeFactory.getChecker(NationalControlCenter);
		ProbeChecker easternChecker = ProbeFactory.getChecker(NationalControlCenter);
		
		// creating 4 differents probe through probe factory
		Probe northernProbe = ProbeFactory.getProbe();
		Probe westernProbe = ProbeFactory.getProbe();
		Probe southernProbe = ProbeFactory.getProbe();
		Probe easternProbe = ProbeFactory.getProbe();
		
		// adds observer to each probe
		northernProbe.subscribeObserver(northernChecker);
		westernProbe.subscribeObserver(westernChecker);
		southernProbe.subscribeObserver(southernChecker);
		easternProbe.subscribeObserver(easternChecker);
		
		// performing detection of smokelevel in each probe
		northernProbe.performDetection();
		westernProbe.performDetection();
		southernProbe.performDetection();
		easternProbe.performDetection();
		
		log.info("");
		log.info("--- Shutting off the National Fire System Program ---");
		log.info("*program correctly closed*");	
	}

}
