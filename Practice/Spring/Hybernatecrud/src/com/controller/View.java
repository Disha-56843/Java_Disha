package com.controller;

import java.util.List;

import com.dao.Dao;
import com.model.Person;


public class View {

	public static void main(String[] args) {
		
		List<Person> list = new Dao().viewdata();
		
		System.out.println("ID\t|\tName\t|\tSurname");
		
		for(Person person : list)
		{
			System.out.println(person.getId()+"\t|\t"+person.getName()+"\t|\t"+person.getSurname());
		}
		
	}
	
}
