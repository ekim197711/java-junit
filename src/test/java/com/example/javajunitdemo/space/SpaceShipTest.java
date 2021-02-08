package com.example.javajunitdemo.space;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SpaceShipTest {

    @ParameterizedTest
    @ValueSource(strings= {"Mike", "Susan", "Maiken", "John"})
    void tryStuff(String captain) {
        SpaceShip spaceShip = new SpaceShip("Box", captain, 88.0d);
        assertEquals("Box", spaceShip.getModel());
        assertEquals(captain, spaceShip.getCaptain());
        assertEquals(88.0d, spaceShip.getFuelPercentage());
        System.out.println(spaceShip);
    }

    @Test
    @Disabled
    void thisTestFails(){
        fail("This test will fail");
    }
}