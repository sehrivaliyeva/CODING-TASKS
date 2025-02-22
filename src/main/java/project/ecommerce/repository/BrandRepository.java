package project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.ecommerce.model.Brand;
@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
