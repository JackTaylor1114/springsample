package de.fhzwickau.studpv.lv.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import de.fhzwickau.studpv.PV.domain.PV;
import de.fhzwickau.studpv.common.BaseEntity;
import de.fhzwickau.studpv.pruefung.domain.Pruefung;

@Entity
public class LV extends BaseEntity<Integer> {
	
	private String bezeichnung;
	
	@OneToMany
	private List<Pruefung> pruefungen;
	
	@OneToMany
	private List<PV> pvs;
	
	public LV(String bezeichnung) {
		super();
		this.bezeichnung = bezeichnung;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public LV() {
	}
	
	public Integer getId() {
		return super.getId();
	}
	
	
}
