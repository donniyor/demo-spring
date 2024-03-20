package uz.dopustim.demo.service.impl;

import org.springframework.stereotype.Service;
import uz.dopustim.demo.model.Product;
import uz.dopustim.demo.repository.InMemoryProductDAO;
import uz.dopustim.demo.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final InMemoryProductDAO repository;

    public ProductServiceImpl(InMemoryProductDAO repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> findAllProduct() {
        return repository.findAllProduct();
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.saveProduct(product);
    }

    @Override
    public Product findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Product updateProduct(Product product) {
        return repository.updateProduct(product);
    }

    @Override
    public void deleteProduct(String name) {
        repository.deleteProduct(name);
    }
}
