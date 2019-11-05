package com.example.examplelistview.Entities;

public class Logement {
    private String Titre;
    private int Surface;
    private int NbePiece;
    private double Prix;
    private String Ville;

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public int getSurface() {
        return Surface;
    }

    public void setSurface(int surface) {
        Surface = surface;
    }

    public int getNbePiece() {
        return NbePiece;
    }

    public void setNbePiece(int nbePiece) {
        NbePiece = nbePiece;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double prix) {
        Prix = prix;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }


}
