package com.retrosen.autogarden;

import com.retrosen.autogarden.logger.GardenLogHandler;
import com.retrosen.autogarden.logger.LoggerFormatter;
import com.retrosen.autogarden.managers.PlotManager;
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
        registerPlot();
        unregisterPlot(5);
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
        gardenLog.addHandler(new ConsoleHandler());
        // Adding custom garden log handler.
        gardenLog.addHandler(new GardenLogHandler());
        try {
            //FileHandler file name with max size and number of log files limit
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
        for (int i = 0; i < plotManagers.size(); i++) {
            // If the manager´s plot ID is the same as the one we want to remove we proceed.
            if (plotManagers.get(i).getId() == id) {
                gardenLog.log(Level.INFO, "Removed plot with id: " + plotManagers.get(i).getId());
            } else {
                gardenLog.log(Level.WARNING, "❎ Plot with ID: " + id + " was not found!");
            }
        }
    }
}
