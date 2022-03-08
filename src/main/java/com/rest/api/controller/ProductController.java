package com.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.rest.api.entity.Product;
import com.rest.api.exception.ProductException;
import com.rest.api.repo.ProductRepository;

@RestController
@RequestMapping("api")
public class ProductController {

	@Autowired
	private ProductRepository repo;

	// Get All products
	@GetMapping("products")
	public List<Product> getAllProducts() {
		return repo.findAll();

	}

	// Create a new products
	@PostMapping("products")
	public Product createProduct(@RequestBody Product product) {
		return repo.save(product);
	}

	// Get a Single product
	@GetMapping("products/{id}")
	public Product getProductById(@PathVariable(value = "id") Long productId) {
		return repo.findById(productId).orElseThrow(() -> new ProductException("Product", "id", productId));
	}

	// Update a product
	@PutMapping("products/{id}")
	public Product updateProduct(@PathVariable(value = "id") Long productId, @RequestBody Product productDetails) {

		Product product = repo.findById(productId).orElseThrow(() -> new ProductException("Product", "id", productId));

		product.setProductName(productDetails.getProductName());
		product.setProductStatus(productDetails.getProductStatus());
		product.setProductDetail(productDetails.getProductDetail());
		product.setProductPrice(productDetails.getProductPrice());

		Product updatedProduct = repo.save(product);
		return updatedProduct;
	}

	// Delete a Product
	@DeleteMapping("products/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable(value = "id") Long productId) {
		Product product = repo.findById(productId).orElseThrow(() -> new ProductException("Product", "id", productId));

		repo.delete(product);

		return ResponseEntity.ok().build();
	}
	/*
	 * @RequestMapping("/products") public String viewProducts(Model model) {
	 * model.addAttribute("viewProducts", productService.getAllProducts()); return
	 * "/prod/products"; }
	 * 
	 * @GetMapping("/deleteProduct/{id}") public String
	 * deleteProduct(@PathVariable(value = "id") long id) {
	 * this.productService.deleteProduct(id); return "redirect:/products"; }
	 * 
	 * @GetMapping("/selectProduct/{id}") public String
	 * selectProduct(@PathVariable(value = "id") long id, Model model) { String
	 * status = productService.getOne(id); if (status.contains("selected")) { return
	 * "redirect:/products?failed"; } else { productService.updateProductStatus(id);
	 * return "redirect:/products?success";
	 * 
	 * }
	 * 
	 * }
	 */

}