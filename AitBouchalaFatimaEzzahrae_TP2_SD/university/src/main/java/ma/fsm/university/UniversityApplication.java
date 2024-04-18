package ma.fsm.university;

import ma.fsm.university.entities.Product;
import ma.fsm.university.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import static java.lang.Long.valueOf;

@SpringBootApplication
public class UniversityApplication implements CommandLineRunner {

    @Autowired

    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(UniversityApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
       // productRepository.save(new Product(null,"computer",3433,3));
        // productRepository.save(new Product(null,"printer",1433,4));
        // productRepository.save(new Product(null," smart phone ",2433,32));
        List<Product> products = productRepository.findAll();
        products.forEach(p ->
        {
            System.out.println(p.toString());
        });
        Product product = productRepository.findById(valueOf(1)).get();
        System.out.println("***************************");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getQuantity());
        System.out.println("*******************************");
        System.out.println("_______________________________");
        List<Product> productList = productRepository.findByNameContains("c");
        productList.forEach(p->{
            System.out.println(p);
        });

        System.out.println("_______________________________");
        List<Product> productList2 = productRepository.search("%C%");
        productList.forEach(p->{
            System.out.println(p);

        });
        System.out.println("_______________________________");
        List<Product> productList3 = productRepository.searchByPrice(3000);
        productList.forEach(p->{
            System.out.println(p);
        });



    }
}
