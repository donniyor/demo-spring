package uz.dopustim.demo.controller;

import org.springframework.web.bind.annotation.*;
import uz.dopustim.demo.model.Product;
import uz.dopustim.demo.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    public ProductController(ProductService service) {
        this.service = service;
    }

    final private ProductService service;

    @GetMapping
    public List<Product> findAllProduct() {
        return service.findAllProduct();
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping("find/{name}")
    public Product findByName(@PathVariable String name) {
        return service.findByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{name}")
    public void deleteProduct(@PathVariable String name)
    {
        service.deleteProduct(name);
    }
}
