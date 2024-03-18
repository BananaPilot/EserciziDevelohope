package com.example.m1e2.persona;

public class Persona {
    private String nome;
    private String provincia;
    private String saluto;

    public Persona(String nome, String provincia){
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = "ciao " + nome + ", com'e' il tempo in " + provincia + "?";
    }

    public String getNome() {
        return nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getSaluto() {
        return saluto;
    }
}
