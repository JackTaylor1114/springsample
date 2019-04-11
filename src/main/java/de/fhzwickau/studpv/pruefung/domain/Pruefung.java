package de.fhzwickau.studpv.pruefung.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import de.fhzwickau.studpv.common.BaseEntity;
import de.fhzwickau.studpv.lv.domain.LV;

@Entity
public class Pruefung extends BaseEntity<Integer> {
	
	@OneToOne
	private LV lv;

	public Pruefung() {}
	
	public LV getLv() {
		return lv;
	}

	public void setLv(LV lv) {
		this.lv = lv;
	}

	
}
