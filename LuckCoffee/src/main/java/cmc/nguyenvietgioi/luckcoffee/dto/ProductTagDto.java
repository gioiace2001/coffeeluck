package cmc.nguyenvietgioi.luckcoffee.dto;

import cmc.nguyenvietgioi.luckcoffee.domain.Product;
import cmc.nguyenvietgioi.luckcoffee.domain.Tag;
import lombok.Data;

@Data
public class ProductTagDto {
    private Long id;
    private Product product;
    private Tag tag;
}