package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Person;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
		Person p = (Person) apc.getBean("m1");
		
		p.display();
		
	}
	
}
