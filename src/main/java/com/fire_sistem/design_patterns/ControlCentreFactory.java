package com.fire_sistem.design_patterns;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ControlCentreFactory {
	 
	 public static I_ControlCentre produceControlCentre(String inputString) {
		 switch(inputString.toUpperCase()) {
		 
		 case "HTTP": 
			 return new HTTPControlCentre();
		 case "":
			 throw new RuntimeException("Invalid input, remember to insert a type of communication channel");
		 default: 
			 throw new RuntimeException("Communication channel not implemented yet");
		 
		 }
	 }
}
