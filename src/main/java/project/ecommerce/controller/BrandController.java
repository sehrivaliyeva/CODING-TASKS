package project.ecommerce.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ecommerce.dto.BrandDto;
import project.ecommerce.model.Brand;
import project.ecommerce.service.BrandService;

@RestController
@RequestMapping("/v/brand")
@RequiredArgsConstructor
public class BrandController {
    private final BrandService brandService;


    @PostMapping("/add")
    public ResponseEntity<Void> addBrand(@RequestBody BrandDto brandDto) {
        brandService.addBrand(brandDto);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
