package ma.fsm.university.web;


import ma.fsm.university.entities.Product;
import ma.fsm.university.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductRestService {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products(){id}")
    public List<Product> products(@PathVariable Long id){
        Product product = productRepository.findById(id).orElse(null);
        return (List<Product>) (List<Product>) product;
    }
}
