package com.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="commentaire")
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComs;

    private int idUtil,idProd;
    private String contenuComs;

    public Commentaire(){}

    public Commentaire(int idComs, int idUtil, int idProd, String contenuComs) {
        this.idComs = idComs;
        this.idUtil = idUtil;
        this.idProd = idProd;
        this.contenuComs = contenuComs;
    }
}
