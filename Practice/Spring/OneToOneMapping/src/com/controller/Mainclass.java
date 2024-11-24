package com.controller;

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
		Address ad = new Address();
		System.out.println("Enter Address:");
		ad.setCity(sc.next());
		ad.setPerson(p);
		sess.save(p);
		sess.save(ad);
		tr.commit();
		sess.close();
		
		sc.close();
	}

}
