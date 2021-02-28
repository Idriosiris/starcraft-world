package com.example.starcraftworld;

public class Marine implements Visitable {

    private int health = 100;

    public int health() {
        return health;
    }

    public void damage() {
        this.health = this.health - 21;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
