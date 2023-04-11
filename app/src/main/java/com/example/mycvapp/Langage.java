package com.example.mycvapp;

public class Langage {
    private String nom;
    private Float niveau;

    public Langage(String nom, Float niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getNiveau() {
        return niveau;
    }

    public void setNiveau(Float niveau) {
        this.niveau = niveau;
    }
}
