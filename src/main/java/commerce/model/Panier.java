package commerce.model;

import jakarta.persistence.*;

@Entity
@Table(name="panier")
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPanier;

    private int idUtil,idProd,qttPanier;

    public Panier(){}

    public Panier(int idPanier, int idUtil, int idProd, int qttPanier) {
        this.idPanier = idPanier;
        this.idUtil = idUtil;
        this.idProd = idProd;
        this.qttPanier = qttPanier;
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

    public int getQttPanier() {
        return qttPanier;
    }

    public void setQttPanier(int qttPanier) {
        this.qttPanier = qttPanier;
    }

    @Override
    public String toString() {
        return "Panier{" +
                "idPanier=" + idPanier +
                ", idUtil=" + idUtil +
                ", idProd=" + idProd +
                ", qttPanier=" + qttPanier +
                '}';
    }
}
