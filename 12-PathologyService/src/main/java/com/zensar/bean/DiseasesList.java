package com.zensar.bean;

import java.util.List;

public class DiseasesList {
	public List<Disease> diseases;

	public List<Disease> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}

	@Override
	public String toString() {
		return "DiseasesList [diseases=" + diseases + "]";
	}
	
}
