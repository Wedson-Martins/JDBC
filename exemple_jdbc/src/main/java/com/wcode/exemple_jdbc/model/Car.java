package com.wcode.exemple_jdbc.model;

public class Car {

	private Long id;
	private String model;

	public Car() {
	}

	public Car(Long id, String model) {
		this.model = model;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + "\nModel: " + this.model + "\n-----------------------------------";
	}

}
