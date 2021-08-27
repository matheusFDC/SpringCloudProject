package one.digitalinnovation.productcatalog.repository;

import one.digitalinnovation.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
