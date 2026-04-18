package com.parcial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.parcial.modelo.*;

public class CriaturaTest {

    @Test
    public void testEstaViva() {
        dragon dragon = new dragon(null, 0, 0);
        assertTrue(dragon.estaViva());
    }

    @Test
    public void testRecibirDaño() {
        guerrero guerrero = new guerrero("Conan", 100, 15);
        guerrero.defender(50);
        assertEquals(50, guerrero.getSalud());
    }

    @Test
    public void testAtaqueDragon() {
        dragon dragon = new dragon(null, 0, 0);
        mago mago = new mago("Merlin", 100, 10);

        dragon.atacar(mago);

        assertEquals(60, mago.getSalud());
    }
}