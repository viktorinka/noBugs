package org.example.task1;

public class Car implements Drivable {
    private String brand;
    private String model;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Car " + getBrand() + " " + getModel() + " " + getYear() + " started.");
    }

    @Override
    public void stop() {
        System.out.println("Car " + getBrand() + " " + getModel() + " " + getYear() + " stopped.");
    }

    @Override
    public void distance(int distance) {
        System.out.println("Distance: " + getBrand() + " " + getModel() + " " + getYear() + " drove " + distance + " kilometers.");
    }
}
