package com.model;

public class Person {
	
	String name;
	Address add;
	
	public Address getCity() {
		return add;
	}

	public void setCity(Address city) {
		this.add = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void dispay() {
		// TODO Auto-generated method stub
		System.out.println(name + " lives in " + add.getCity());
		
	}
	
}
