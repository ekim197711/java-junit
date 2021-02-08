package com.example.javajunitdemo.space;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SpaceShipFactoryTryStuff {

    @BeforeEach
    void beforeEachTest(){
        System.out.println("Preparing each test");
    }
    @BeforeAll
    static void beforeAllTest(){
        System.out.println("Preparing all test");
    }
    @AfterEach
    void afterEachTest(){
        System.out.println("This is run AFTER each test");
    }
    @AfterAll
    static void afterAllTest(){
        System.out.println("This is run AFTER ALL tests");
    }

    @Test
    @DisplayName("Test the method that determines how much fuel the space ship is created with")
    void tryFuelFormula(){
        SpaceShipFactory spaceShipFactory = new SpaceShipFactory(100.0d);
        assertEquals(50.0d, spaceShipFactory.fuelQty());
        spaceShipFactory = new SpaceShipFactory(300.0d);
        assertEquals(100.0d, spaceShipFactory.fuelQty());
    }

    @Test
    @DisplayName("Try to create a new spaceship with the factory")
    void createOne() {
        SpaceShipFactory spaceShipFactory = new SpaceShipFactory(100.0d);
        SpaceShip one = spaceShipFactory.createOne();
        assertNotNull(one);
        assertNotNull(one.getCaptain());
        assertNotNull(one.getFuelPercentage());
        assertNotNull(one.getModel());
        assertEquals("Mike", one.getCaptain());
        assertEquals("Round", one.getModel());
        assertTrue(one.getFuelPercentage() > 5.0d);
    }
}