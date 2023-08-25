package com.model;


import jakarta.persistence.*;

@Entity
@Table(name="utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUtil;

    private String nomUtil;

    private String prenomUtil;

    private String adrMail;

    private String motPasse;

    private String adrUtil;

    private String numPhone;

    public Utilisateur() {
    }

    public Utilisateur(int idUtil, String nomUtil, String prenomUtil, String adrMail, String motPasse, String adrUtil, String numPhone) {
        this.idUtil = idUtil;
        this.nomUtil = nomUtil;
        this.prenomUtil = prenomUtil;
        this.adrMail = adrMail;
        this.motPasse = motPasse;
        this.adrUtil = adrUtil;
        this.numPhone = numPhone;
    }

    public int getIdUtil() {
        return idUtil;
    }

    public void setIdUtil(int idUtil) {
        this.idUtil = idUtil;
    }

    public String getNomUtil() {
        return nomUtil;
    }

    public void setNomUtil(String nomUtil) {
        this.nomUtil = nomUtil;
    }

    public String getPrenomUtil() {
        return prenomUtil;
    }

    public void setPrenomUtil(String prenomUtil) {
        this.prenomUtil = prenomUtil;
    }

    public String getAdrMail() {
        return adrMail;
    }

    public void setAdrMail(String adrMail) {
        this.adrMail = adrMail;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public String getAdrUtil() {
        return adrUtil;
    }

    public void setAdrUtil(String adrUtil) {
        this.adrUtil = adrUtil;
    }

    public String getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }
}
