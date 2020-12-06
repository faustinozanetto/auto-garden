package com.retrosen.autogarden.plant;

public class Plant {
	private String name;
	private String description;
	private PlantTypes plantType;
	private String variety;
	private int height;

	// Full constructor
	public Plant(String name, String description, PlantTypes plantType, String variety, int height) {
		this.name = name;
		this.description = description;
		this.plantType = plantType;
		this.variety = variety;
		this.height = height;
	}

	// Default constructor
	public Plant() {

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

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
