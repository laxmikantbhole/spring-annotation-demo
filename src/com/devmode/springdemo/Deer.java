package com.devmode.springdemo;

import org.springframework.stereotype.Component;

@Component("myDeer")
public class Deer implements Animal {

	@Override
	public String getSpeed() {
		return "80 km/h";
	}

}










