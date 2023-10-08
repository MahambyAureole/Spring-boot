package commerce.controlleur;

import commerce.model.Utilisateur;
import commerce.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UtilisateurController {

    private UtilisateurService utilServe;

    @Autowired
    public UtilisateurController(UtilisateurService utilServe) {
        this.utilServe = utilServe;
    }

    @GetMapping("/afficheUtil")
    public List<Utilisateur> afficherUtilisateur(){
        return utilServe.afficher();
    }

    @PostMapping(value= "/ajoutUtil", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void ajouter(@RequestBody Utilisateur util){
        try{
            utilServe.enregistrer(util);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @DeleteMapping("/effaceUtil/{id}")
    public List<Utilisateur> supprimerUtil(@PathVariable int id){
        try{
        utilServe.supprimer(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return utilServe.afficher();
    }

    @PutMapping("/modifierUtil/{id}")
    public void modifierUtil(@PathVariable("id_util") int id, @RequestBody Utilisateur util){
        Utilisateur utilModifier = utilServe.get(id);

        utilModifier.setNomUtil(util.getNomUtil());
        utilModifier.setPrenomUtil(util.getPrenomUtil());
        utilModifier.setAdrMail(util.getAdrMail());
        utilModifier.setMotPasse(util.getMotPasse());
        utilModifier.setAdrUtil(util.getAdrUtil());
        utilModifier.setNumPhone(util.getNumPhone());

        try{
            utilServe.enregistrer(utilModifier);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(util);
    }
}
