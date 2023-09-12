package com.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

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

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
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

    public int getPrixProd() {
        return prixProd;
    }

    public void setPrixProd(int prixProd) {
        this.prixProd = prixProd;
    }
}
