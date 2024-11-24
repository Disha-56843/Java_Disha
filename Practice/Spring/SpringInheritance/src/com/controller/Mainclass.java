package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Person;

public class Mainclass {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("Beans.xml");
		Person p = (Person) apc.getBean("m2");
		
		System.out.println(p.getName()+" from "+ p.getCity());
		
	}
	
}
