package com.retrosen.autogarden.plant;

public class Plant {
	private String name;
	private String description;
	private PlantTypes plantType;
	private int height;

	// Default Constructor
	public Plant() {

	}

	// Full Constructor
	public Plant(String name, String description, PlantTypes plantType, int height) {
		this.name = name;
		this.description = description;
		this.plantType = plantType;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PlantTypes getPlantType() {
		return plantType;
	}

	public void setPlantType(PlantTypes plantType) {
		this.plantType = plantType;
	}


	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
