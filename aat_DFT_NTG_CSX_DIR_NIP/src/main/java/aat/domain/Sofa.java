package aat.domain;

import java.io.Serializable;

public class Sofa implements Serializable {
	private String material;
	private String firmness;

	public String getFirmness() {
		return firmness;
	}

	public void setFirmness(String firmness) {
		this.firmness = firmness;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
