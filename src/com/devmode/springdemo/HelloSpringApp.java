package com.devmode.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

//		// load the spring configuration file
//		ClassPathXmlApplicationContext context = 
//				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// retrieve bean from spring container
		Animal animal = configApplicationContext.getBean("myHorse", Animal.class);
		
		// call methods on the bean
		System.out.println(animal.getSpeed());
		
		// close the context
		configApplicationContext.close();
	}

}







