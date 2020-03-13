package com.redhat.healthcare.domain;

import java.io.Serializable;

public class Patient implements Serializable {

	private static final long serialVersionUID = 1L;

	public Integer id;

	public String patientFullName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPatientFullName() {
		return this.patientFullName;
	}

	public void setPatientFullName(String name) {
		this.patientFullName = name;
	}

}
