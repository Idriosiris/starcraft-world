package com.example.starcraftworld;

public class InfantryFactory {
    Marine marine() {
        return new Marine();
    }

    Marauder marauder() {
        return new Marauder();
    }
}
