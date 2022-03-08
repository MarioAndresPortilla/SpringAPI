package restApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import restApi.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
}
