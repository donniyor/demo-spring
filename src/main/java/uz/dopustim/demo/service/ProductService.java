package uz.dopustim.demo.service;

import org.springframework.stereotype.Service;
import uz.dopustim.demo.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();
    Product saveProduct(Product product);
    Product findByName(String name);
    Product updateProduct(Product product);
    void deleteProduct(String name);
}
