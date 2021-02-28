package com.example.patterncraftvisitor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TankAttackingTest {
    private final InfantryFactory infantryFactory = new InfantryFactory();
    private final VehicleFactory  vehicleFactory  = new VehicleFactory();

    @Test
    void tankDamageOnMarineIs21() {
        Marine marine = infantryFactory.marine();
        Tank   tank   = vehicleFactory.tank();

        assertEquals(100, marine.health());

        tank.attack(marine);

        assertEquals(79, marine.health());
    }

    @Test
    void tankDamageOnMarauderIs32() {
        Marauder marauder = infantryFactory.marauder();
        Tank     tank     = vehicleFactory.tank();

        assertEquals(125, marauder.health());

        tank.attack(marauder);

        assertEquals(93, marauder.health());
    }
}
