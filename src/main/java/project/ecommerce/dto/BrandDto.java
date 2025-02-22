package project.ecommerce.dto;

import lombok.Data;

import java.util.Set;

@Data
public class BrandDto {

    private String name;
    private Set<Long> categoryIds;

}
