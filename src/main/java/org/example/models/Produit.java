package org.example.models;

import java.util.Objects;

public class Produit {

    private Long id;
    private String libelle;
    private Double prix;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return Objects.equals(id, produit.id) && Objects.equals(libelle, produit.libelle) && Objects.equals(prix, produit.prix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libelle, prix);
    }
}
