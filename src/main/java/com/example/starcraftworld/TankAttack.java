package com.example.starcraftworld;

public class TankAttack implements Visitor {

    @Override
    public void visit(Marine marine) {
        marine.damage();
    }

    @Override
    public void visit(Marauder marauder) {
        marauder.damage();
    }
}
