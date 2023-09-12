package com.service;

import com.model.Panier;
import com.repository.PanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanierService {
    private final PanierRepository panierRepos;

    @Autowired
    public PanierService(PanierRepository panierRepos) {
        this.panierRepos = panierRepos;
    }

    public void remplirPan(Panier pan) {
        panierRepos.save(pan);
    }

    public List<Panier> listePanier() {
        return panierRepos.findAll();
    }

    public void viderPanier(int id){
        panierRepos.deleteById(id);
    }

    public Panier getPanier(int id){
        return panierRepos.findById(id).get();
    }
}
