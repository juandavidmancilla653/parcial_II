package com.parcial.modelo;

public class Batalla {

    public static void main(String[] args) {

        guerrero guerrero = new guerrero("Conan", 100, 15);
        mago mago = new mago("Merlin", 100, 10);
        dragon dragon = new dragon("Smaug", 120, 20);

        System.out.println("🔥 INICIA LA BATALLA 🔥\n");

        dragon.atacar(guerrero);

        guerrero.atacar(dragon);

        mago.atacar(dragon);

        System.out.println("\n ESTADO FINAL ");
        System.out.println(guerrero.getNombre() + ": " + guerrero.getSalud());
        System.out.println(mago.getNombre() + ": " + mago.getSalud());
        System.out.println(dragon.getNombre() + ": " + dragon.getSalud());
    }
}