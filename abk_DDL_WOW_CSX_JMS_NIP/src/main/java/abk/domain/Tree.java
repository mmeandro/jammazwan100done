package abk.domain;

import java.io.Serializable;

public class Tree implements Serializable{
	private String species;
	private String desc;

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String name) {
		this.species = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
