package com.controlleur;

import com.model.Product;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductService prodServe;

    @Autowired
    public ProductController(ProductService prodServe) {
        this.prodServe = prodServe;
    }

    @GetMapping("/listeProduit")
    public List<Product> listeProduit(){ return prodServe.listeProduit();}

        @PostMapping("/ajouterProduit")
    public List<Product> ajouterProduit(@RequestBody Product prod){
        prodServe.ajouterProd(prod);
        return listeProduit();
    }

    @DeleteMapping("/effaceProd/{id}")
    public List<Product> supprimerProd(@PathVariable int id){
        prodServe.supprimerProd(id);
        return prodServe.listeProduit();
    }

    @PutMapping("/modifierProd")
    public List<Product> modifierProd( @RequestBody Product prod){
        prodServe.ajouterProd(prod);
        return prodServe.listeProduit();
    }
}
