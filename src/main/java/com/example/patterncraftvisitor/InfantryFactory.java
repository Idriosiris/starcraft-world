package com.example.patterncraftvisitor;

public class InfantryFactory {
    Marine marine() {
        return new Marine();
    }

    Marauder marauder() {
        return new Marauder();
    }
}
