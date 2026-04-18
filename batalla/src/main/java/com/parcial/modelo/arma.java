package com.parcial.modelo;

public class arma {
    private int dañoAdicional;

    public arma(int dañoAdicional) {
        this.dañoAdicional = dañoAdicional;
    }

    public int atacarConArma() {
        return dañoAdicional;
    }

    public int getDañoAdicional() {
        return dañoAdicional;
    }
}