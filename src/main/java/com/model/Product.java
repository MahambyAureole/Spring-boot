package com.model;

import jakarta.persistence.*;

@Entity
@Table(name="produit")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProd;

    private int prixProd,stockProd;
    private String nomProd,descProd,categorieProd,imageProd;

    public Product() {
    }

    public Product(int idProd, int prixProd, int stockProd, String nomProd, String descProd, String categorieProd, String imageProd) {
        this.idProd = idProd;
        this.prixProd = prixProd;
        this.stockProd = stockProd;
        this.nomProd = nomProd;
        this.descProd = descProd;
        this.categorieProd = categorieProd;
        this.imageProd = imageProd;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getPrixProd() {
        return prixProd;
    }

    public void setPrixProd(int prixProd) {
        this.prixProd = prixProd;
    }

    public int getStockProd() {
        return stockProd;
    }

    public void setStockProd(int stockProd) {
        this.stockProd = stockProd;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getDescProd() {
        return descProd;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    public String getCategorieProd() {
        return categorieProd;
    }

    public void setCategorieProd(String categorieProd) {
        this.categorieProd = categorieProd;
    }

    public String getImageProd() {
        return imageProd;
    }

    public void setImageProd(String imageProd) {
        this.imageProd = imageProd;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "idProd=" + idProd +
                ", prixProd=" + prixProd +
                ", stockProd=" + stockProd +
                ", nomProd='" + nomProd + '\'' +
                ", descProd='" + descProd + '\'' +
                ", categorieProd='" + categorieProd + '\'' +
                ", imageProd='" + imageProd + '\'' +
                '}';
    }
}
