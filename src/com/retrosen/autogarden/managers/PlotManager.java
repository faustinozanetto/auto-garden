package com.retrosen.autogarden.managers;

import java.util.logging.Level;

import com.retrosen.autogarden.plant.Plant;
import com.retrosen.autogarden.plot.Plot;
import com.retrosen.autogarden.Main;

public class PlotManager {
	private int id;
	private Plot plot;

	// Full constructor
	public PlotManager(int id, Plot plot) {
		this.plot = plot;
	}

	// Default constructor
	public PlotManager() {
	}

	// Method for registering plant to the plot.
	public void addPlant(Plant plant) {
		// If we have not reached max plants limit we continue.
		if (plot.getPlants().size() <= plot.getMaxPlants()) {
			plot.getPlants().add(plant);
			Main.getLogger().log(Level.INFO, "✅ Successfully added a new Plant with ID: " + plant.getId());
		}
	}

	// Method for removing plant from plot.
	public void removePlant(Plant plant) {
		if (plot.getPlants().contains(plant)) {
			plot.getPlants().remove(plant);
			Main.getLogger().log(Level.INFO, "✅ Successfully removed Plant with ID: " + plant.getId());
		} else {
			Main.getLogger().log(Level.WARNING, "❎ Plant with ID: " + plant.getId() + " was not found!");
		}
	}

	// Method for getting a plant by id
	public Plant getPlantByID(int id) {
		// Loop through all the plants list and get the one with same ID.
		for (int i = 0; i < plot.getPlants().size(); i ++) {
			if (plot.getPlants().get(i).getId() == id) {
				return plot.getPlants().get(i);
			}
		}
		return null;
	}

	// Returning the size of the plants array of the plot.
	public int plants() {
		return plot.getPlants().size();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Plot getPlot() {
		return plot;
	}

}
