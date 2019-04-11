package de.fhzwickau.studpv.lehrperson.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import de.fhzwickau.studpv.common.BaseEntity;
import de.fhzwickau.studpv.lv.domain.LV;

@Entity
public class Lehrperson extends BaseEntity<Integer>{

	private String name;
	
	@ManyToMany
	private List<LV> lvs = new ArrayList<>();
	
	public Lehrperson() {
	}
	
	public Lehrperson(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}