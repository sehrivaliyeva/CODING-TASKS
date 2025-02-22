package project.ecommerce.dto;

import lombok.Data;

@Data
public class ProductDto {
    private String name;
    private double price;
    private int amount;
    private Long categoryId;
}
