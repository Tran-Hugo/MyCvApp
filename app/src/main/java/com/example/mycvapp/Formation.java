package com.example.mycvapp;

public class Formation {
    private String dateObtention;
    private String diplome;
    private String lieu;

    public Formation(String dateObtention, String diplome, String lieu) {
        this.dateObtention = dateObtention;
        this.diplome = diplome;
        this.lieu = lieu;
    }

    public String getDateObtention() {
        return dateObtention;
    }

    public void setDateObtention(String dateObtention) {
        this.dateObtention = dateObtention;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

}
