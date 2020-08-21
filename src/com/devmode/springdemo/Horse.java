package com.devmode.springdemo;

import org.springframework.stereotype.Component;

@Component("myHorse")
public class Horse implements Animal {
	
	@Override
	public String getSpeed() {
		return "48 km/h";
	}

	
	public void init() {
		System.out.println("In init method");
	}
	
	public void destroy() {
		System.out.println("In destroy method");
	}
}








