package commerce.service;

import commerce.model.Utilisateur;
import commerce.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    private UtilisateurRepository utilRepos;

    @Autowired
    public UtilisateurService (UtilisateurRepository utilRepos){
        this.utilRepos = utilRepos;
    }

    public void enregistrer(Utilisateur util){
        utilRepos.save(util);
    }

    public List<Utilisateur> afficher(){
        return utilRepos.findAll();
    }

    public void supprimer(int id){
        utilRepos.deleteById(id);
    }

    public Utilisateur get(int id) {
        return utilRepos.findById(id).get();
    }
}
