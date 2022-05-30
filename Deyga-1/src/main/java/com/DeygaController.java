package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class DeygaController {

	@Autowired
	private Product product;
	@Autowired
	private ProductRepo proRepo;

	RestTemplate restTemplate = new RestTemplate();

	private static final String GET_ALL_PROD = "https://deyga-testing-store.myshopify.com/admin/api/2022-04/products.json";

	private static String Key = "X-Shopify-Access-Token";

	private static String Key_value = "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";

	@GetMapping("/SaveProducts")
	public ResponseEntity<Products> getAllAPIProduct() {
		HttpHeaders headers = new HttpHeaders();

		headers.addIfAbsent(Key, Key_value);

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

		ResponseEntity<Products> products = restTemplate.exchange(GET_ALL_PROD, HttpMethod.GET, entity, Products.class);

		for (Product pro : products.getBody().getProducts())

			proRepo.save(pro);

		return products;

	}

	@GetMapping("/products")
	  public ResponseEntity<List<Product>> getAllVideos(@RequestParam(required = false) String title) {
	    try {
	      List<Product> product = new ArrayList<Product>();
	      if (title == null)
	    	  proRepo.findAll().forEach(product::add);
	      else
	    	  proRepo.findByTitleContaining(title).forEach(product::add);
	      if (product.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(product, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	

	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") long id) {
		Product product = proRepo.findById(id);
		
		System.out.println("contro"+	product);
		
		if (product != null) {
			return new ResponseEntity<>(product, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/products")
	public ResponseEntity<String> createProduct(@RequestBody Product product) {
		try {
			proRepo.save(new Product(product.getId(), product.getTitle(), product.getVendor(),
					product.getProduct_type(), product.getCreated_at()));
			return new ResponseEntity<>("Product was created successfully.", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/products/{id}")
	  public ResponseEntity<String> updateProduct(@PathVariable("id") long id, @RequestBody Product product) {
		  Product _product = proRepo.findById(id);
	    if (_product!= null) {
	    	_product.setId(id);
	    	
	    	System.out.println("bfr"+product.getTitle());
	    	
	    	_product.setTitle(product.getTitle());
	    	
	    	System.out.println("aftr"+product.getTitle());
	    	
	    	_product.setVendor(product.getVendor());
	    	_product.setProduct_type(product.getProduct_type());
	    	_product.setCreated_at(product.getCreated_at());
	    	
	    	System.out.println(_product);
	    	
	    	proRepo.update(_product);
	    	
	      return new ResponseEntity<>("Products was updated successfully with id=" + id, HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>("Cannot find Product with id=" + id, HttpStatus.NOT_FOUND);
	    }
	  }

	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> deleteProducts(@PathVariable("id") long id) {
		try {
			int result = proRepo.deleteById(id);
			if (result == 0) {
				return new ResponseEntity<>("Cannot find product with id=" + id, HttpStatus.OK);
			}
			return new ResponseEntity<>("product was deleted successfully with id=" + id, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Cannot delete product.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/products")
	public ResponseEntity<String> deleteAllProducts() {
		try {
			int numRows = proRepo.deleteAll();
			return new ResponseEntity<>("Deleted " + numRows + " Product(s) successfully.", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Cannot delete products.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
