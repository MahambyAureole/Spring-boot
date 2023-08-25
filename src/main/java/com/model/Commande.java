package com.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Date;
import java.util.TimeZone;

@Getter
@Setter
@ToString
@Entity
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCom;

    private int idUtil, idProd, qttCom;
    private String adrLivraison;

    /*@Column(name = "date_com", columnDefinition = "DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)*/

    private Timestamp dateCom = new Timestamp(System.currentTimeMillis());

    public Commande() {
    }

    public Commande(int idCom, int idUtil, int idProd, int qttCom, String adrLivraison) {
        this.idCom = idCom;
        this.idUtil = idUtil;
        this.idProd = idProd;
        this.qttCom = qttCom;
        this.adrLivraison = adrLivraison;
        this.dateCom = new Timestamp(System.currentTimeMillis());
    }

    public Commande(int idUtil, int idProd, int qttCom, String adrLivraison) {
        this.idUtil = idUtil;
        this.idProd = idProd;
        this.qttCom = qttCom;
        this.adrLivraison = adrLivraison;
        this.dateCom = new Timestamp(System.currentTimeMillis());
    }

}
