package com.retrosen.autogarden.plot;

import com.retrosen.autogarden.plant.Plant;

public class Plot {
	private int id;
	private Plant[] plants;
	private int maxPlants;

	// Full constructor
	public Plot(int id, int maxPlants) {
		this.id = id;
		this.maxPlants = maxPlants;
	}

	// Default constructor
	public Plot() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Plant[] getPlants() {
		return plants;
	}

	public void setPlants(Plant[] plants) {
		this.plants = plants;
	}

	public int getMaxPlants() {
		return maxPlants;
	}

	public void setMaxPlants(int maxPlants) {
		this.maxPlants = maxPlants;
	}
}
