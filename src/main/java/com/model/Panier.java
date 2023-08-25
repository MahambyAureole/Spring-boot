package com.model;

import jakarta.persistence.*;

@Entity
@Table(name="commentaire")
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPanier;

    private int idUtil,idProd,nbrPanier;

    public Panier(){}

    public Panier(int idPanier, int idUtil, int idProd, int nbrPanier) {
        this.idPanier = idPanier;
        this.idUtil = idUtil;
        this.idProd = idProd;
        this.nbrPanier = nbrPanier;
    }

    public int getIdPanier() {
        return idPanier;
    }

    public void setIdPanier(int idPanier) {
        this.idPanier = idPanier;
    }

    public int getIdUtil() {
        return idUtil;
    }

    public void setIdUtil(int idUtil) {
        this.idUtil = idUtil;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getNbrPanier() {
        return nbrPanier;
    }

    public void setNbrPanier(int nbrPanier) {
        this.nbrPanier = nbrPanier;
    }

    @Override
    public String toString() {
        return "Panier{" +
                "idPanier=" + idPanier +
                ", idUtil=" + idUtil +
                ", idProd=" + idProd +
                ", nbrPanier=" + nbrPanier +
                '}';
    }
}
