package com.example.patterncraftvisitor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class InfantryTest {

    private final InfantryFactory infantryFactory = new InfantryFactory();

    @Test
    void marineHealthIs100() {
        Marine marine = infantryFactory.marine();

        assertEquals(100, marine.health());
    }

    @Test
    void marauderHealthIs125() {
        Marauder marauder = infantryFactory.marauder();

        assertEquals(125, marauder.health());
    }
}
