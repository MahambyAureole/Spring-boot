package commerce.controlleur;

import commerce.model.Product;
import commerce.repository.ProductRepository;
import commerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductService prodServe;
    private ProductRepository produitRepository;

    @Autowired
    public ProductController(ProductService prodServe) {
        this.prodServe = prodServe;
    }

    @GetMapping("/listeProduit")
    public List<Product> listeProduit() {
        return prodServe.listeProduit();
    }

    @PostMapping("/ajouterProduit")
    public List<Product> ajouterProduit(@RequestBody Product prod) {
        try {
            prodServe.saveProd(prod);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listeProduit();
    }

    @DeleteMapping("/effaceProd/{id}")
    public List<Product> supprimerProd(@PathVariable int id) {
        try {
            prodServe.supprimerProd(id);

        }catch (Exception e){
            e.printStackTrace();
        }
        return listeProduit();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PatchMapping("/modifierProd/{id}")
    public void update(@PathVariable("id") int idProd, @RequestBody Product produit) {

        try {
            Product produitModifier = prodServe.getProd(idProd);

            produitModifier.setCategorieProd(produit.getCategorieProd());
            produitModifier.setDescProd(produit.getDescProd());
            produitModifier.setImageProd(produit.getImageProd());
            produitModifier.setNomProd(produit.getNomProd());
            produitModifier.setStockProd(produit.getStockProd());
            produitModifier.setPrixProd(produit.getPrixProd());

            prodServe.saveProd(produitModifier);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
