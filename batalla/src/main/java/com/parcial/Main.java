package com.parcial;

import com.parcial.modelo.*;

public class Main {

    public static void main(String[] args) {

        
        dragon dragon = new dragon("Draco", 100, 20);
        mago mago = new mago("Merlin", 80, 15);
        guerrero guerrero = new guerrero("Conan", 120, 18);

    
        Arma espada = new Arma(10);
        guerrero.equiparArma(espada);

    
        dragon.volar();
        mago.lanzarHechizo();

        System.out.println("\n BATALLA: Dragon vs Guerrero \n");

        batalla(dragon, guerrero);

        System.out.println("\n BATALLA: Mago vs Guerrero \n");

        batalla(mago, guerrero);
    }

    public static void batalla(Criatura c1, Criatura c2) {

        while (c1.estaViva() && c2.estaViva()) {

            c1.atacar(c2);

            if (c2.estaViva()) {
                c2.atacar(c1);
            }

            System.out.println("------");
        }

        if (c1.estaViva()) {
            System.out.println(c1.getNombre() + " ha ganado ");
        } else {
            System.out.println(c2.getNombre() + " ha ganado ");
        }
    }
}


// cambio para pull request