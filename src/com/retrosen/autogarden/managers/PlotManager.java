package com.retrosen.autogarden.managers;

import com.retrosen.autogarden.plant.Plant;
import com.retrosen.autogarden.plot.Plot;

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
	public void registerPlant(Plant plant) {

	}

	// Method for removing plant from plot.
	public void unregisterPlant(Plant plant) {

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

	public Plot gePlot() {
		return plot;
	}

}
