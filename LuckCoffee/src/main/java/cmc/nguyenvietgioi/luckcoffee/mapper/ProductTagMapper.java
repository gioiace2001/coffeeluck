package cmc.nguyenvietgioi.luckcoffee.mapper;

import cmc.nguyenvietgioi.luckcoffee.domain.ProductTag;
import cmc.nguyenvietgioi.luckcoffee.dto.ProductTagDto;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductTagMapper implements EntityMapper<ProductTagDto, ProductTag>{
    @Override
    public ProductTagDto toDo(ProductTag productTag) {
        return null;
    }

    @Override
    public ProductTag toEntity(ProductTagDto productTagDto) {
        return null;
    }

    @Override
    public List<ProductTagDto> toDo(List<ProductTag> e) {
        return null;
    }

    @Override
    public List<ProductTag> toEntity(List<ProductTagDto> d) {
        return null;
    }
}
