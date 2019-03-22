package de.fhzwickau.studpv.student.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id @GeneratedValue
	private String name;
	private Integer ID;

	public Student() {
		
	}
	
	public Student(String name, Integer ID) {
		this.name = name;
		this.ID = ID;
	}

	public String getName() {
		return name;
	}
	
	public Integer getID() {
		return ID;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
