package com.pluralsight;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        // Houses
        assets.add(new House("My First House", "2018-02-01", 200000, "Morska 9A, Torun, Poland", 3, 2060, 4620));
        assets.add(new House("Vacation House", "2020-03-04", 305000, "Asnyka 8C,Torun, Poland", 1, 1800, 3200));

        // Vehicles
        assets.add(new Vehicle("Tom's Truck", "2023-07-23", 34000, "Honda HR-V", 2023, 29550));
        assets.add(new Vehicle("Eric's Car", "2025-01-01", 148000, "Mercedes-Benz G 550", 2025, 15550));
        assets.add(new Vehicle("My Car", "2019-01-01", 20000, "Toyota Camry", 2015, 110000));

        // Cash
        assets.add(new Cash("For rainy days", "2025-01-04", 200));

        // Loop
        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            if (asset instanceof House house) {
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle vehicle) {
                System.out.println("Year/MakeModel: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }

            System.out.println("------------------------------");
        }
    }
}
