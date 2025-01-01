package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Person;

public class Select {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your id:");
		int id = sc.nextInt();
		
		Person p = new Person();
		p.setId(id);
		
		
		Person data = new Dao().getSingle(p);
		System.out.println(data.getName() + " " + data.getSurname());
		
		
	}
	
}
