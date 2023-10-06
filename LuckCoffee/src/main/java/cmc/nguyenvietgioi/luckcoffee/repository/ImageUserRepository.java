package cmc.nguyenvietgioi.luckcoffee.repository;

import cmc.nguyenvietgioi.luckcoffee.domain.ImageUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageUserRepository extends JpaRepository<ImageUser,Long> {


    Optional<ImageUser> findByName(String fileName);
}
