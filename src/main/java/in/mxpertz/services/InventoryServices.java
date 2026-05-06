package in.mxpertz.services;

import java.util.List;

import org.springframework.stereotype.Service;

import in.mxpertz.model.Product;
import in.mxpertz.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryServices {

    private final InventoryRepository inventoryRepository;

    public Product addProduct(Product product) {
        return inventoryRepository.save(product);
    }

    public Product updateProduct(int id, Product product) {

        Product existingProduct = inventoryRepository.findById(id).get();

        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());

        return inventoryRepository.save(existingProduct);
    }
    
    public void removeProduct(int id) {
        inventoryRepository.deleteById(id);
    }


    public List<Product> allProducts() {
        return inventoryRepository.findAll();
    }
}