package com.parcial.modelo;

import com.parcial.Interfaces.Volador;

public class dragon extends Criatura implements Volador {

    public dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = 40;
        System.out.println(nombre + " lanza fuego y causa " + daño + " de daño");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando alto en el cielo");
    }

    @Override
    public void aterrizar() {
        System.out.println(nombre + " aterriza");
    }
}