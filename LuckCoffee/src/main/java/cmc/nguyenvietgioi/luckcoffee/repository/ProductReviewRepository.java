package cmc.nguyenvietgioi.luckcoffee.repository;

import cmc.nguyenvietgioi.luckcoffee.domain.ProductReview;
import cmc.nguyenvietgioi.luckcoffee.projection.RatingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductReviewRepository extends JpaRepository<ProductReview, String> {
    String db = "coffeeshop";
    @Query(value = "select * from "+db+".product_review where product_id = :productId", nativeQuery = true)
    List<ProductReview> findByProduct(String productId);

    @Query(value = " select * from "+db+".product_review " +
            " where user_id = :userId and product_id = :productId "
            , nativeQuery = true)
    Optional<ProductReview> filterRatingWithUserAndProduct(Long userId, Long productId);
    @Query(value = "select AVG(rating) as diem, COUNT(rating) as dem from "+db+".product_review " +
            " where product_id = :productId", nativeQuery = true)
    RatingInfo ratingAvgByProduct(Long productId);
}
