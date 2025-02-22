package project.ecommerce.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.ecommerce.dto.BrandDto;
import project.ecommerce.model.Brand;
import project.ecommerce.model.Category;
import project.ecommerce.repository.BrandRepository;
import project.ecommerce.repository.CategoryRepository;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class BrandService {
    private final BrandRepository brandRepository;
    private final CategoryRepository categoryRepository;


    public void addBrand(BrandDto brandDto) {
        Set<Category> categories = new HashSet<>(categoryRepository.findAllById(brandDto.getCategoryIds()));
        Brand brand = new Brand();
        brand.setName(brandDto.getName());
        brand.setCategories(categories);

        brandRepository.save(brand);
    }
}
