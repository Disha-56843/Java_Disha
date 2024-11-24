package com.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Address2")
public class Address {
	
	@OneToMany

	List<Person> list;	
	
	public List<Person> getList() {
		return list;
	}
	
	public void setList(List<Person> list) {
		this.list = list;
	}

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy="increment")
	@Column(name = "cid")
	private int id;
	
	@Column(name = "city")
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	

}
