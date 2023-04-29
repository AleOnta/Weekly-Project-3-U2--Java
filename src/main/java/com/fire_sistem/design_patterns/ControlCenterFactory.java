package com.fire_sistem.design_patterns;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ControlCenterFactory {
	 
	 public static I_ControlCentre produceControlCentre(String inputString) {
		 switch(inputString.toUpperCase()) {
		 
		 case "HTTP": 
			 return new HTTPControlCenter();
		 default: 
			 throw new RuntimeException("Communication channel not implemented yet");
		 
		 }
	 }
}
