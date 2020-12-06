package com.retrosen.autogarden.plot;

import java.util.ArrayList;

import com.retrosen.autogarden.plant.Plant;
import java.util.List;

public class Plot {
	private int id;
	private List<Plant> plants = new ArrayList<>();
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

	public List<Plant> getPlants() {
		return plants;
	}

	public void setPlants(List<Plant> plants) {
		this.plants = plants;
	}

	public int getMaxPlants() {
		return maxPlants;
	}

	public void setMaxPlants(int maxPlants) {
		this.maxPlants = maxPlants;
	}
}
