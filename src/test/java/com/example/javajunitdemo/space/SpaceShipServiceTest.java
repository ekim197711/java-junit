package com.example.javajunitdemo.space;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Tag("integration")
class SpaceShipServiceTest {

    @Autowired
    SpaceShipService service;

    @Test
    void createOne() {
        SpaceShip one = service.createOne();
        assertNotNull(one);
        assertNotNull(one.getModel());
        assertNotNull(one.getCaptain());
    }
}