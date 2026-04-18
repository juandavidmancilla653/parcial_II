package com.parcial.modelo;

import com.parcial.interfaces.magico;

public class mago extends Criatura implements magico {

    public mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " lanza un hechizo ✨");
        objetivo.defender(fuerza);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe daño. Salud: " + salud);
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " usa magia poderosa");
    }

    @Override
    public void aprenderHechizo() {
        System.out.println(nombre + " aprende un nuevo hechizo");
    }
}