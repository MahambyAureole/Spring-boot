package com.controlleur;

import com.model.Panier;
import com.service.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PanierController {
    public PanierService panierService;

    @Autowired
    public PanierController(PanierService panierService) {
        this.panierService = panierService;
    }

    @GetMapping("/listPanier")
    public List<Panier> listePan(){
        return panierService.listePanier();
    }
    @PostMapping("/ajoutPanier")
    public List<Panier> ajoutPanier(@RequestBody Panier pan) {
        try {
            panierService.remplirPan(pan);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listePan();
    }

    @DeleteMapping("/effacePan/{id}")
    public List<Panier> supprimerPan(@PathVariable int id) {
        try {
            panierService.viderPanier(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listePan();
    }
    @PutMapping("/modifierProd/{id}")
    public void updatePanier(@PathVariable("id") int idPan, @RequestBody Panier pan) {

        try {
            Panier panModifier = panierService.getPanier(idPan);

            panModifier.setIdUtil(pan.getIdUtil());
            panModifier.setIdProd(pan.getIdProd());
            panModifier.setQttPanier(pan.getQttPanier());

            panierService.remplirPan(pan);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
