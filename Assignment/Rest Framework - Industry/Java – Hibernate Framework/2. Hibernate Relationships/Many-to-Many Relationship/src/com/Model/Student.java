package com.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



@Entity
public class Student {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;

	    @ManyToMany
	    @JoinTable(
	        name = "student_course",
	        joinColumns = @JoinColumn(name = "student_id"),
	        inverseJoinColumns = @JoinColumn(name = "course_id")
	    )
	    private Set<Course> courses = new HashSet<>();

	    // Constructors, Getters, and Setters
	    public Student() {}
	    public Student(String name) {
	        this.name = name;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Set<Course> getCourses() {
	        return courses;
	    }

	    public void addCourse(Course course) {
	        this.courses.add(course);
	        course.getStudents().add(this);
	    }
	
}
