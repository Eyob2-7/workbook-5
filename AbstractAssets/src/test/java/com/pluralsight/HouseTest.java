package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {
    @Test
    void testGetValue_ExcellentCondition(){
        // Arrange
        House house = new House("Test House","2020-10-12",120000,"4111 Ellinger Dr",1,1500,2900);

        //Act
        double actualValue = house.getValue();

        // Assert
        double expected = (1500 * 180) + (0.25 * 2900);
        assertEquals(expected, actualValue);
    }

}