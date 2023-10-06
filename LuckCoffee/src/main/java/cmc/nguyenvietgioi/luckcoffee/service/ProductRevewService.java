package cmc.nguyenvietgioi.luckcoffee.service;

import cmc.nguyenvietgioi.luckcoffee.config.SecurityUtils;
import cmc.nguyenvietgioi.luckcoffee.domain.Product;
import cmc.nguyenvietgioi.luckcoffee.domain.ProductReview;
import cmc.nguyenvietgioi.luckcoffee.dto.ProductReviewDto;
import cmc.nguyenvietgioi.luckcoffee.mapper.ProductReviewMapper;
import cmc.nguyenvietgioi.luckcoffee.repository.ProductRepository;
import cmc.nguyenvietgioi.luckcoffee.repository.ProductReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductRevewService {
    private final ProductReviewMapper productReviewMapper;
    private final ProductReviewRepository productReviewRepository;
    private final ProductRepository productRepository;

    public void create(ProductReviewDto dto){
        ProductReview entity = productReviewMapper.toEntity(dto);
        Product product = productRepository.findById(dto.getProductId()).orElse(null);
        entity.setProduct(product);
        entity.setUser(SecurityUtils.getPrincipal());
        entity.setPublished(0);
        entity.setCreatedAt(Instant.now());
        productReviewRepository.save(entity);
    }
    public void delete(String id){
        ProductReview entity = productReviewRepository.findById(id).orElseThrow();
        productReviewRepository.delete(entity);
    }

    public ProductReviewDto filterRatingWithUserAndProduct(Long productId){
        ProductReview entity = productReviewRepository.filterRatingWithUserAndProduct(
                SecurityUtils.getPrincipal().getId(), productId
        ).orElse(null);
        if (entity != null){
        ProductReviewDto dto = productReviewMapper.toDo(entity);

        return dto;
        } else {
            System.out.println("Bạn chưa đánh giá sản phẩm này!");
            return null;
        }
    }
    public List<ProductReviewDto> getAllByProduct(String productId){
        List<ProductReview> entity = productReviewRepository.findByProduct(productId);
        List<ProductReviewDto> dtos = productReviewMapper.toDo(entity);
        return dtos;
    }
}
