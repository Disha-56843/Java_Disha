package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Person;

public class Update {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your id");
		int id = sc.nextInt();
		
		System.out.println("Enter your name");
		String name = sc.next();
		
		System.out.println("Enter your surname");
		String surname = sc.next();
		
		Person p = new Person();
		p.setId(id);
		p.setName(name);
		p.setSurname(surname);
		
		new Dao().update(p);
		
	}
	
}
