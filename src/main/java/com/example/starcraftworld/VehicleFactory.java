package com.example.starcraftworld;

public class VehicleFactory {
    Tank tank() {
        return new Tank(new TankAttack());
    }

}
