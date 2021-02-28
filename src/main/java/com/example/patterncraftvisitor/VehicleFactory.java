package com.example.patterncraftvisitor;

public class VehicleFactory {
    Tank tank() {
        return new Tank(new TankAttack());
    }

}
