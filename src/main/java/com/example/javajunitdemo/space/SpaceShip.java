package com.example.javajunitdemo.space;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip {
    private String model;
    private String captain;
    private double fuelPercentage;
}
