package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Model.Address;
import com.Model.Person;
import com.connect.Util;


public class Mainclass {
	
	public static void main(String[] args) {
		
		Session sess =  new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		p.setName(sc.next());
		
		Person p2 = new Person();
		System.out.println("Enter name2:");
		p2.setName(sc.next());
		
		
		Address ad = new Address();
		System.out.println("Enter Address:");
		ad.setCity(sc.next());
		
		List<Person>list = new ArrayList<Person>();
		list.add(p);
		list.add(p2);
		
		ad.setList(list);
		sess.save(p);
		sess.save(p2);
		sess.save(ad);
		tr.commit();
		sess.close();
		
		sc.close();
	}

}
