package com.controlleur;

import com.model.Commentaire;
import com.service.CommentaireService;
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
        comsService.ajoutComs(coms);
    }

    @DeleteMapping("/deleteComs/{id}")
    public  List<Commentaire> deleteComs(@PathVariable int id){
        comsService.deleteComs(id);
        return afficheComs();
    }

    @PostMapping("/modifierComs")
    public List<Commentaire> modifierComs(@RequestBody Commentaire coms){
        comsService.ajoutComs(coms);
        return afficheComs();
    }
}
