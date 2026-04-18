package com.parcial.modelo;

public class Arma {
    private int dañoAdicional;

    public Arma(int dañoAdicional) {
        this.dañoAdicional = dañoAdicional;
    }

    public int atacarConArma() {
        return dañoAdicional;
    }

    public int getDañoAdicional() {
        return dañoAdicional;
    }
}