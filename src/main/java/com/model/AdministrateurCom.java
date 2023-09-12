package com.model;

import jakarta.persistence.*;

@Entity
@Table(name="administrateur")
public class AdministrateurCom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdmin;

    private String nomAdmin, motPasseAdmin;

    public AdministrateurCom() {
    }

    public AdministrateurCom(int idAdmin, String nomAdmin, String motPasseAdmin) {
        this.idAdmin = idAdmin;
        this.nomAdmin = nomAdmin;
        this.motPasseAdmin = motPasseAdmin;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNomAdmin() {
        return nomAdmin;
    }

    public void setNomAdmin(String nomAdmin) {
        this.nomAdmin = nomAdmin;
    }

    public String getMotPasseAdmin() {
        return motPasseAdmin;
    }

    public void setMotPasseAdmin(String motPasseAdmin) {
        this.motPasseAdmin = motPasseAdmin;
    }

    @Override
    public String toString() {
        return "AdministrateurCom{" +
                "idAdmin=" + idAdmin +
                ", nomAdmin='" + nomAdmin + '\'' +
                ", motPasseAdmin='" + motPasseAdmin + '\'' +
                '}';
    }
}
