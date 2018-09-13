package com.omniasoftware.persone.lavoratori;



public class Dipendente extends Lavoratore {



    private double pagaOrariaBase = 8.7;
    private int oreLavoro;
    private int matricola;
    private String dataAssunzione;


    public Dipendente(String nome, String cognome,double denaroPosseduto, int oreLavoro, String dataAssunzione, double pagaOrariaBase) {
        super(nome, cognome,denaroPosseduto);
        this.setMatricola();
        this.setDataAssunzione(dataAssunzione);
        this.setOreLavoro(oreLavoro);

        if(pagaOrariaBase != this.pagaOrariaBase && pagaOrariaBase >= 5.0){
            this.setPagaOrariaBase(pagaOrariaBase);
        }

    }

    @Override
    protected double calcolaStipendio(){

        return (this.getOreLavoro() * this.getPagaOrariaBase());

    }

    public int getOreLavoro() {
        return oreLavoro;
    }

    public void setOreLavoro(int oreLavoro) {
        this.oreLavoro = oreLavoro;
        setStipendio(this.calcolaStipendio());
    }

    public String getDataAssunzione() {
        return dataAssunzione;
    }

    private void setDataAssunzione(String dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }



    public int getMatricola() {
        return matricola;
    }

    private void setMatricola() {
        this.matricola = Lavoratore.matricolaProgressiva++;
    }

    public double getPagaOrariaBase() {
        return pagaOrariaBase;
    }

    private void setPagaOrariaBase(double pagaOrariaBase){
        this.pagaOrariaBase = pagaOrariaBase;
        this.setStipendio(this.calcolaStipendio());
    }
}
