package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void getValue_HondaRecentLowMileage() {
        // Arrange
        int currentYear = LocalDate.now().getYear();
        Vehicle vehicle = new Vehicle("My Car", "2023-01-01",25000,
                                      "Honda HR-V", 2023,30000);
        // Act
        double actual = vehicle.getValue();

        // Assert
        double expected = 25000 * Math.pow(0.97, 2);
        assertEquals(expected,actual);
    }
}