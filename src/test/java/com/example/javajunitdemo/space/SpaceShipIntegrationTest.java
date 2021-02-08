package com.example.javajunitdemo.space;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("integration")
public class SpaceShipIntegrationTest {

    @Test
    void myintegrationTest(){
        Assertions.fail("The 3rd party service is not available");
    }

}
