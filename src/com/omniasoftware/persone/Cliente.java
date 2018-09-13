package com.omniasoftware.persone;

public class Cliente extends Persona{
    private String indirizzo;
    private String telefono;

    public Cliente(String nome, String cognome,double denaroPosseduto, String indirizzo, String telefono) {
        super(nome, cognome,denaroPosseduto);
        this.setIndirizzo(indirizzo);
        this.setTelefono(telefono);
    }

    public String toString(){
        return super.toString() + "\n" +
                this.getIndirizzo() + "\n" +
                this.getTelefono();
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
