package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    // Constructor


    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    // Getters and Setters

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double pricePerSqFt = switch (condition) {
            case 1 -> 180;
            case 2 -> 130;
            case 3 -> 90;
            default -> 80;
        };
        return (squareFoot * pricePerSqFt) + (0.25 * lotSize);
    }
}
