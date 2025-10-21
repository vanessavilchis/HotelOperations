package com.pluralsight;

// Private encapsulated data or Instance Variables
public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied, dirty;

    // Constructor
    //Parameters or variables/info needed for building our "room" class
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        //The instance variable belongs to THIS specific Room object
        this.numberOfBeds = numberOfBeds; // The parameter is the value passed into the constructor
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    // Getters : provides controlled read access.
    public int getNumberOfBeds() {
        return numberOfBeds; // Sends back the value of variable called
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }
    public void checkIn() {
        this.occupied = true;
        this.dirty = true;
    }
    public void checkout() {
        this.occupied = false;
    }

    public void cleanRoom() {
        this.dirty = false;     // Room is now clean

    }
}