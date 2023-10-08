package commerce.controlleur;

import commerce.model.Commentaire;
import commerce.service.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CommentaireController {
    private CommentaireService comsService;

    @Autowired
    public CommentaireController(CommentaireService comsService) {
        this.comsService = comsService;
    }

    @GetMapping("/afficheComs")
    public List<Commentaire> afficheComs(){
        return comsService.afficheComs();
    }

    @PostMapping("/ajoutComs")
    public void ajoutCommentaire(@RequestBody Commentaire coms){
        try {
            comsService.ajoutComs(coms);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @DeleteMapping("/deleteComs/{id}")
    public  List<Commentaire> deleteComs(@PathVariable int id){
        try{
            comsService.deleteComs(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return afficheComs();
    }

    @PostMapping("/modifierComs")
    public List<Commentaire> modifierComs(@RequestBody Commentaire coms){
        try {
        comsService.ajoutComs(coms);
        }catch (Exception e){
            e.printStackTrace();
        }
        return afficheComs();
    }
}
