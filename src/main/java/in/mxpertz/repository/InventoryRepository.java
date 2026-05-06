package in.mxpertz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mxpertz.model.Product;

public interface InventoryRepository extends JpaRepository<Product, Integer>{

}
