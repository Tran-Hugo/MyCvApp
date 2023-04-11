package com.example.mycvapp;

public class Projet {
    private String nom;
    private String duree;
    private String description;
    private String lien;

    public Projet(String nom, String duree, String description) {
        this(nom, duree, description, null);
    }

    public Projet(String nom, String duree, String description, String lien) {
        this.nom = nom;
        this.duree = duree;
        this.description = description;
        this.lien = lien;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }
}
