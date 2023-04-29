package com.fire_sistem.design_patterns;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public abstract class Subject {
	
	@Getter
	private final List<Observer> probesObserved = new ArrayList<Observer>();
	
	public void subscribeObserver(Observer observer) {
		this.getProbesObserved().add(observer);
	}
	
	public void unsubscribeObserver(Observer observer) {
		this.getProbesObserved().remove(observer);
	}
	
	public void notifyControlCentre() {
		this.getProbesObserved().forEach(probe -> probe.update(this));
	}
	
}
