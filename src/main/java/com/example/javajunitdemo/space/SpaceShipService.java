package com.example.javajunitdemo.space;

import org.springframework.stereotype.Service;

@Service
public class SpaceShipService {

    public SpaceShip createOne(){
        return new SpaceShip(
                "Pyramid",
                "Jens",
                44.0d
        );
    }
}
