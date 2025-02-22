package project.ecommerce.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.ecommerce.dto.ProductDto;
import project.ecommerce.model.Category;
import project.ecommerce.model.Product;
import project.ecommerce.repository.CategoryRepository;
import project.ecommerce.repository.ProductRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public void addProduct(ProductDto productDto) {
        Optional<Category> categoryOptional = categoryRepository.findById(productDto.getCategoryId());

        if (categoryOptional.isEmpty()) {
            throw new RuntimeException("Category not found with ID: " + productDto.getCategoryId());
        }

        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setAmount(productDto.getAmount());
        product.setCategory(categoryOptional.get());

        productRepository.save(product);
    }
}
