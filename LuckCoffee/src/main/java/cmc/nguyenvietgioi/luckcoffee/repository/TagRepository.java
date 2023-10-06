package cmc.nguyenvietgioi.luckcoffee.repository;

import cmc.nguyenvietgioi.luckcoffee.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, String> {
}
