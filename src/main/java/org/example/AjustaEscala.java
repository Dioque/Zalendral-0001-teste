package org.example;

public class AjustaEscala {

    private double escalaAltura;
    private double escalaLargura;
    public int baseAltura = 3;
    public int baseLargura = 3;

    public AjustaEscala(int janelaAltura, int janelaLargura) {
        this.escalaAltura = (double) janelaAltura / baseAltura;
        this.escalaLargura = (double) janelaLargura / baseLargura;
    }

    public double getEscalaAltura() {
        return escalaAltura;
    }

    public double getEscalaLargura() {
        return escalaLargura;
    }
}
