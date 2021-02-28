package com.example.patterncraftvisitor;

public interface Visitor {
    void visit(Marine marine);
    void visit(Marauder marauder);
}
