package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class ProductController 
{
	@Autowired
	static ProductService ProductService;

	@GetMapping("DeygaProducts")
	public ResponseEntity<String> getAllProducts() {
		return ProductService.getAllProducts();
	}
	
	@GetMapping("addproducts")
	public ResponseEntity<Product> storeProDetails(Product product)
	{
		return ProductService.storeProDetails(product);
		
	}
}
