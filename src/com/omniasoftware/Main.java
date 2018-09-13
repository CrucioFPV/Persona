package com.omniasoftware;

import com.omniasoftware.persone.lavoratori.Ceo;
import com.omniasoftware.persone.lavoratori.Dipendente;
import com.omniasoftware.persone.lavoratori.Programmatore;

public class Main {

    public static void main( String[] args ) {
        Programmatore programmatore = new Programmatore("manuel", "lusenti", 100, 180,
                "30-11-11", 8.9, 2, "HelloWorld","Java");
        Dipendente dipendente = new Dipendente("carlo", "verdoni", 100000, 2,
                "22-4-1956", 50);
        Ceo ceo = new Ceo("Capo","Supremo",200000000);

        System.out.println(programmatore.getDenaroPosseduto());
        dipendente.paga(1200, programmatore);
        System.out.println(programmatore.getDenaroPosseduto());
        System.out.println(dipendente.getDenaroPosseduto());

        ceo.pagaLavoratore(dipendente,programmatore);
        System.out.println("-----------------paga--------------");
        System.out.println(programmatore.getDenaroPosseduto());
        System.out.println(dipendente.getDenaroPosseduto());

    }
}
