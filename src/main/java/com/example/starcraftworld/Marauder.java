package com.example.starcraftworld;

public class Marauder implements Visitable {

    private int health = 125;

    public int health() {
        return health;
    }

    public void damage() {
        this.health = this.health - 32;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
