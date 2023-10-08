package commerce.controlleur;

import commerce.model.Commande;
import commerce.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommandeController {

    private CommandeService comServe;

    @Autowired
    public CommandeController(CommandeService comServe) {
        this.comServe = comServe;
    }

    @GetMapping("/listeCommande")
    public List<Commande> listeProduit(){ return comServe.listeCommande();}

    @PostMapping("/ajoutCommande")
    public String ajouterProduit(@RequestBody Commande com){
        comServe.ajoutCommande(com);
        return "Enregistrement Réussi!";
    }

    @DeleteMapping("/deleteCommande/{id}")
    public List<Commande> supprimercommande(@PathVariable int id){
        comServe.supprimerCommande(id);
        return comServe.listeCommande();
    }

    @PutMapping("/modifyCommande")
    public void modifierProd(@RequestBody Commande com){
        comServe.ajoutCommande(com);
        System.out.println(com);
    }
}
