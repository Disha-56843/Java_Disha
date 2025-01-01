package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Model.Course;
import com.Model.Student;
import com.connect.Util;


public class Mainclass {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Assign courses to students
        student1.addCourse(course1);
        student1.addCourse(course2);

        student2.addCourse(course1);

        // Persist entities
        em.persist(course1);
        em.persist(course2);
        em.persist(student1);
        em.persist(student2);

        em.getTransaction().commit();

        // Retrieve student-course details
        System.out.println("Students and their courses:");
        Student retrievedStudent = em.find(Student.class, student1.getId());
        for (Course course : retrievedStudent.getCourses()) {
            System.out.println(retrievedStudent.getName() + " is enrolled in " + course.getName());
        }

        em.close();
        emf.close();
	}

}
