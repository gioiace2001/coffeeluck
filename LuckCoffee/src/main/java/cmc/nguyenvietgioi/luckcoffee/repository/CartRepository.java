package cmc.nguyenvietgioi.luckcoffee.repository;

import cmc.nguyenvietgioi.luckcoffee.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, String> {
    List<Cart> findAllByUserId(Long userId);
    String db = "coffeeshop";
    /*
        todo: các trạng thái của cart
        Trạng thái của đơn đặt hàng có thể là
        0 -> sử dụng
        1 -> đã qua sử dùng :))

     */


    @Query(value = "select c.* from "+ db +".cart c where user_id = :userId and status = :status order by updated_at DESC", nativeQuery = true)
    List<Cart> findUsersCart(Long userId, String status);

    @Query(value = "select * from cart as c where c.user_id = :userId and c.status = 0 ", nativeQuery = true)
    Optional<Cart> isActiveCart(Long userId);
}