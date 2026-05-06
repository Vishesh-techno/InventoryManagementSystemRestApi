package in.mxpertz.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mxpertz.model.Product;
import in.mxpertz.services.InventoryServices;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class InventoryController {

	private final InventoryServices inventoryService;
	
	@GetMapping("/allProduct")
	public List<Product> allProducts(){
		return inventoryService.allProducts();
	}
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return inventoryService.addProduct(product);
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
		return inventoryService.updateProduct(id, product);
	}
	
	@DeleteMapping("/{id}")
	public String removeProduct(@PathVariable int id) {
		inventoryService.removeProduct(id);
		return "Product Removed SuccessFully";
	}

}
