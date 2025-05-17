package com.tourism.tourismrecommenderproject.service;

public class Destination {
    private String name;
    private String description;
    private String location;
    private double rating;

    // Constructor with parameters
    public Destination(String name, String description, String location, double rating) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.rating = rating;
    }

    // Default constructor
    public Destination() {
    }

    // Getters and setters
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
