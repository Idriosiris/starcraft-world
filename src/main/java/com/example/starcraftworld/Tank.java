package com.example.starcraftworld;

public class Tank {

    private final Visitor tankAttack;

    public Tank(Visitor tankAttack) {
        this.tankAttack = tankAttack;
    }

    public void attack(Visitable visitable) {
        visitable.accept(tankAttack);
    }
}
