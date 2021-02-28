package com.example.starcraftworld;

public interface Visitor {
    void visit(Marine marine);
    void visit(Marauder marauder);
}
