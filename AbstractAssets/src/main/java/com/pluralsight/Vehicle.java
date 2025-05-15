package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    // Constructor
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    // Getters and Setters
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        int carAge = currentYear - year;
        double value;
        // if vehicle loses 3% of its value each year, we are keeping 97% of its value each year 0-3years
        // if vehicle loses 6% of its value each year, we are keeping 94% of its value each year 4-6years
        // if vehicle loses 8% of its value each year, we are keeping 92% of its value each year 7-10years
        if (carAge <= 3) {
            value = getOriginalCost() * Math.pow(0.97, carAge);
        } else if (carAge <= 6) {
            value = getOriginalCost() * Math.pow(0.94, carAge);
        } else if (carAge <= 8) {
            value = getOriginalCost() * Math.pow(0.92, carAge);
        } else {
            value = 1000;
        }
        // if odometer is > 100,000miles unless makeModel is Honda or Toyota, final value reduce by 25%
        boolean over100k = odometer > 100000;
        boolean isHondaOrToyota = (makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"));

        return (over100k && !isHondaOrToyota) ? value * 0.75 : value;
    }
}
