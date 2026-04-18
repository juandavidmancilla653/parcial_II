package com.parcial.modelo;

public class guerrero extends Criatura {

    private Arma arma;

    public guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;

        if (arma != null) {
            daño += arma.getDañoAdicional();
            System.out.println(nombre + " ataca con arma y causa " + daño);
        } else {
            System.out.println(nombre + " ataca sin arma y causa " + daño);
        }

        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe daño. Salud: " + salud);
    }
}