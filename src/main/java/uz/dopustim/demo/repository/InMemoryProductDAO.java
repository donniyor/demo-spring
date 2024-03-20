package uz.dopustim.demo.repository;

import org.springframework.stereotype.Repository;
import uz.dopustim.demo.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryProductDAO {
    private final List<Product> PRODUCT = new ArrayList<>();

    public List<Product> findAllProduct() {
        return PRODUCT;
    }

    public Product saveProduct(Product product) {
        PRODUCT.add(product);
        return product;
    }

    public Product findByName(String name) {
        return PRODUCT.stream()
                .filter(element -> element.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public Product updateProduct(Product product) {
        var ProductIndex = IntStream.range(0, PRODUCT.size())
                .filter(index -> PRODUCT.get(index).getName().equals(product.getName()))
                .findFirst()
                .orElse(-1);
        if (ProductIndex > -1) {
            PRODUCT.set(ProductIndex, product);
            return product;
        }
        return null;
    }

    public void deleteProduct(String name) {
        var product = findByName(name);

        if (product != null) {
            PRODUCT.remove(product);
        }
    }
}
