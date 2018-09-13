package com.omniasoftware.persone.lavoratori;

public class Programmatore extends Dipendente {
    private boolean IsFirstLinguaggio = true;
    private boolean IsLinguaggiProgrInitialized;
    private int anniEsperienza;
    private String[] linguaggiProgrammazione;

    public Programmatore(String nome, String cognome,double denaroPosseduto, int oreLavoro, String dataAssunzione, double pagaOrariaBase,
                         int anniEsperienza, String... linguaggiProgrammazione) {

        super(nome, cognome,denaroPosseduto, oreLavoro, dataAssunzione, pagaOrariaBase);
        this.setAnniEsperienza(anniEsperienza);
        this.setLinguaggiProgrammazione(linguaggiProgrammazione);
        this.IsLinguaggiProgrInitialized = true;
        this.setStipendio(this.calcolaStipendio());


    }

    @Override
    protected double calcolaStipendio(){
        //Todo: Sistemare con ecezzioni togliendo il campo boolean per controllo
        if(IsLinguaggiProgrInitialized) {
            double temp = 1 + ( (this.getLinguaggiProgrammazione().length/100.0) + (this.getAnniEsperienza()/10.0) );
            return temp * (this.getOreLavoro() * this.getPagaOrariaBase());
        }
        return 0;
    }
    public int getAnniEsperienza() {
        return anniEsperienza;
    }

    public void setAnniEsperienza(int anniEsperienza) {
        this.anniEsperienza = anniEsperienza;
        this.setStipendio(this.calcolaStipendio());

    }


    public String[] getLinguaggiProgrammazione() {
        return linguaggiProgrammazione;
    }

    public void setLinguaggiProgrammazione(String[] linguaggiProgrammazione) {


        if(!IsFirstLinguaggio) {
           this.linguaggiProgrammazione = this.mergeArray(this.getLinguaggiProgrammazione(),linguaggiProgrammazione);
        }
        else{
            this.linguaggiProgrammazione = linguaggiProgrammazione;
            IsFirstLinguaggio = false;
        }

        this.setStipendio(this.calcolaStipendio());

    }



    private String[] mergeArray(String[] arrayOriginale, String[] arrayNuovo){
        int finalLenght = arrayNuovo.length+arrayOriginale.length;
        String[] finalArray = new String[finalLenght];

        int index = 0;

        for(String temp : arrayOriginale){
            finalArray[index++] = temp;

        }

        for(String temp : arrayNuovo){
            finalArray[index++] = temp;
        }

        return finalArray;
    }

}
