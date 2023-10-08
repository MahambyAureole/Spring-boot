package commerce.service;

import commerce.model.Commentaire;
import commerce.repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaireService {
    private CommentaireRepository comsRepos;
@Autowired
    public CommentaireService(CommentaireRepository comsRepos) {
        this.comsRepos = comsRepos;
    }
    public  void  ajoutComs(Commentaire coms){
        comsRepos.save(coms);
    }
    public List<Commentaire> afficheComs(){
        return  comsRepos.findAll();
    }
    public void deleteComs(int idComs){
        comsRepos.deleteById(idComs);
    }
    public  Commentaire getComs(int id){
        return  comsRepos.findById(id).get();
    }
}
