package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Person;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
		Person p = (Person) apc.getBean("m1");
		System.out.println(p.getId() + " " + p.getName());
		
		Person p1 = (Person) apc.getBean("m1");
		
		p1.setId(102);
		p1.setName("payal");
		
		//System.out.println(p.getId() + " " + p.getName());
		System.out.println(p1.getId() + " " + p1.getName());
		
	}
	
}
