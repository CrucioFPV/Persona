package com.omniasoftware.persone.lavoratori;

import com.omniasoftware.persone.Persona;

public abstract class Lavoratore extends Persona  {

    protected static int matricolaProgressiva = 1;
    private double stipendio;

    public Lavoratore(String nome, String cognome, double denaroPosseduto) {
        super(nome, cognome,denaroPosseduto);
    }

    protected abstract double calcolaStipendio();

    public double getStipendio() {
        return this.stipendio;
    }

    protected void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }
}
