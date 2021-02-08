package com.example.javajunitdemo.space;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SpaceShipFactory {
    private final double spaceBucks;

    public SpaceShip createOne(){
        return new SpaceShip(
                "Round",
                "Mike",
                fuelQty()
        );
    }

    protected double fuelQty(){
        return Math.min(100.0d, spaceBucks / 2.0d);
    }

}
