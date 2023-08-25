package com.service;

import com.model.Commande;
import com.model.Product;
import com.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {

    private CommandeRepository comRepos;

    @Autowired
    public CommandeService(CommandeRepository comRepos) {
        this.comRepos = comRepos;
    }

    public void ajoutCommande(Commande com){
        comRepos.save(com);
    }
    public List<Commande> listeCommande(){
        return comRepos.findAll();
    }

    public void supprimerCommande(int id){
        comRepos.deleteById(id);
    }

    public Commande getIdCommande(int id){
        return comRepos.findById(id).get();
    }
}
