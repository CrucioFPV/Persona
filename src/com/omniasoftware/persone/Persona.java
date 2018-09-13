package com.omniasoftware.persone;

public class Persona implements Saluto, Consumatore {

    private String nome;
    private String cognome;
    private double denaroPosseduto;


    public Persona(String nome, String cognome, double denaroPosseduto) {
        this.setNome(nome);
        this.setCognome(cognome);
        this.setDenaroPosseduto(denaroPosseduto);
    }

    public String toString() {
        return this.getNome() + "\n" + this.getCognome();
    }

    public final void saluta() {
        System.out.println(ciao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getDenaroPosseduto() {
        return denaroPosseduto;
    }

    private void setDenaroPosseduto(double denaroPosseduto) {
        this.denaroPosseduto = denaroPosseduto;
    }

    @Override
    public void paga(double somma, Persona destinatarioSomma) {
        if(this.getDenaroPosseduto()>=somma) {
            this.setDenaroPosseduto(this.getDenaroPosseduto() - somma);
            destinatarioSomma.depositaSoldi(somma);
        }
    }

    @Override
    public void depositaSoldi(double somma) {
        this.setDenaroPosseduto(this.getDenaroPosseduto()+somma);
    }
}

