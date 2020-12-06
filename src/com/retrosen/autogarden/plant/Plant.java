package com.retrosen.autogarden.plant;

import java.util.Vector;

public class Plant {
	private int id;
	private String name;
	private String description;
	private PlantTypes plantType;
	private String variety;
	private Dimensions dimensions;

	// Full constructor
	public Plant(int id, String name, String description, PlantTypes plantType, String variety, Dimensions dimensions) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.plantType = plantType;
		this.variety = variety;
		this.dimensions = dimensions;
	}

	// Default constructor
	public Plant() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Dimensions getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	public static class Dimensions {
		private int width;
		private int height;

		// Full constructor
		public Dimensions(int width, int height) {
			this.width = width;
			this.height = height;
		}

		// Default constructor
		public Dimensions() {

		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getHeight() {
			return this.height;
		}

		public void setHeight(int height) {
			this.height = height;
		}
	}
}
