package aat.domain;

import java.io.Serializable;

public class Cushion implements Serializable {
	private String color;
	private String pattern;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

}
