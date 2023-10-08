package commerce.service;

import commerce.model.Product;
import commerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository reposProduit;

    @Autowired
    public ProductService(ProductRepository reposProduit) {
        this.reposProduit = reposProduit;
    }

    public void saveProd(Product prod){
        reposProduit.save(prod);
    }

    public List<Product> listeProduit(){
        return reposProduit.findAll();
    }

    public void supprimerProd(int id){
        reposProduit.deleteById(id);
    }

    public Product getProd(int id) {
        return reposProduit.findById(id).get();
    }
}
