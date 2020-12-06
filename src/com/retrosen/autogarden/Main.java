package com.retrosen.autogarden;

import com.retrosen.autogarden.logger.GardenLogHandler;
import com.retrosen.autogarden.logger.LoggerFormatter;
import com.retrosen.autogarden.managers.PlotManager;
import com.retrosen.autogarden.plant.PlantTypes;
import com.retrosen.autogarden.plant.Plant.Dimensions;
import com.retrosen.autogarden.plant.Plant;
import com.retrosen.autogarden.plot.Plot;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class Main {
    private static final Logger gardenLog = Logger.getLogger(Main.class.getName());
    private static final List<PlotManager> plotManagers = new ArrayList<>();

    public static void main(String[] args) {
        // Calling logger setup method
        setupLogger();
        gardenLog.log(Level.INFO, "##############################");
        gardenLog.log(Level.INFO, "Auto Garden");
        gardenLog.log(Level.INFO, "Version: 0.0.1");
        gardenLog.log(Level.INFO, "Made By: Retrosen");
        gardenLog.log(Level.INFO, "Build Date: 12/6/2020");
        gardenLog.log(Level.INFO, "##############################");

        registerPlot();

        Plant tomato = new Plant(0, "Tomato", "Robust plant with a lot of fruits", PlantTypes.TOMATO, "Perita",
                new Dimensions(20, 45));
        // Plant squash = new Plant(1, "Skuash", "Big plant with green fruits",
        // PlantTypes.SQUASH, "Wild", new Dimensions(60, 40));

        getPlotManager(0).addPlant(tomato);
        // getPlotManager(0).addPlant(squash);

        // getPlotManager(0).removePlant(squash);

        gardenLog.log(Level.INFO, String.valueOf(getPlotManager(0).getPlot().getPlants().get(0).getName()));

    }

    public static void setupLogger() {
        // Garden logger setup
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("logger.properties"));
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
        gardenLog.setLevel(Level.FINE);
        // Adding console handler
        // gardenLog.addHandler(new ConsoleHandler());
        // Adding custom garden log handler.
        gardenLog.addHandler(new GardenLogHandler());
        try {
            // FileHandler file name with max size and number of log files limit
            Handler fileHandler = new FileHandler("G:/Programming/Java/auto-garden/auto-garden/garden.log", 2000, 1);
            fileHandler.setFormatter(new LoggerFormatter());
            // Adding the file handler to the logger.
            gardenLog.addHandler(fileHandler);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }

    // Method for registering a new garden plot.
    public static void registerPlot() {
        // Creating a new plot instance.
        Plot plot = new Plot(1, 10);
        // Creating a plot manager for the new plot.
        PlotManager plotManager = new PlotManager(0, plot);
        plotManagers.add(plotManager);
        gardenLog.log(Level.INFO, "✅ Successfully created a new Plot with ID: " + plot.getId());
    }

    // Method for un-registering a garden plot by ID
    public static void unregisterPlot(int id) {
        // We loop through all the plot managers.
        for (int i = 0; i <= plotManagers.size(); i++) {
            // If the manager´s plot ID is the same as the one we want to remove we proceed.
            if (plotManagers.get(i).getPlot().getId() == id) {
                gardenLog.log(Level.INFO, "✅ Successfully removed Plot with ID: " + plotManagers.get(i).getId());
                plotManagers.remove(i);
            } else {
                gardenLog.log(Level.WARNING, "❎ Plot with ID: " + id + " was not found!");
            }
        }
    }

    // Method for getting a plot manager reference
    public static PlotManager getPlotManager(int id) {
        // If the id is bigger thant the array size return a new object.
        if (!(plotManagers.size() <= id)) {
            // Loop through all the managers and get the one with same id.
            for (int i = 0; i <= plotManagers.size(); i++) {
                if (plotManagers.get(i).getId() == id) {
                    return plotManagers.get(i);
                } else {
                    // If there was no manager found show this message.
                    gardenLog.log(Level.WARNING, "❎ Plot Manager with ID: " + id + " was not found!");
                }
            }
        }
        gardenLog.log(Level.WARNING, "❎ ID out of bounds");
        throw new IllegalArgumentException("❎ ID out of bounds");
    }

    public static Logger getLogger() {
        return gardenLog;
    }
}
