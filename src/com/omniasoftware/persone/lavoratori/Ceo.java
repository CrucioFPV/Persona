package com.omniasoftware.persone.lavoratori;

import com.omniasoftware.persone.Consumatore;
import com.omniasoftware.persone.Persona;

public class Ceo extends Persona implements Consumatore {
    public Ceo( String nome, String cognome, double denaroPosseduto ) {
        super(nome, cognome, denaroPosseduto);
    }

    public void pagaLavoratore(Lavoratore... lavoratore){

        for(Lavoratore lavoratoreTemp : lavoratore) {
            double somma = lavoratoreTemp.getStipendio();
            this.paga(somma,lavoratoreTemp);
        }

    }
}
