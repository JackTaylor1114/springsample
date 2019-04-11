package de.fhzwickau.studpv.student.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

import de.fhzwickau.studpv.common.BaseEntity;
import de.fhzwickau.studpv.lv.domain.LV;

@Entity
public class Student extends BaseEntity<Integer> {
	
	
	//@Id @GeneratedValue
	//private Integer ID;
	
	private String name;
	
	@ManyToMany
	private List<LV> lvs = new ArrayList<>();

	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	//Muss hier eig nicht rein, da baseentity getID hat
	public Integer getID() {
		return super.getId();
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<LV> getLvs() {
		return lvs;
	}

	public void setLvs(List<LV> lvs) {
		this.lvs = lvs;
	}
	
	public void addLvs(LV Lv) {
		this.lvs.add(Lv);
	}
	
	
	
	
}
