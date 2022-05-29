package com;


import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class DeygaController {

	@Autowired
	private JdbcProductRepo proRepo;
	

	RestTemplate restTemplate = new RestTemplate();

	private static final String GET_ALL_PROD = "https://deyga-testing-store.myshopify.com/admin/api/2022-04/products.json";

	private static final String GET_SING_PROD = "https://deyga-testing-store.myshopify.com/admin/api/2022-04/products/632910392.json";

	private static final String SHOP = "https://deyga-testing-store.myshopify.com/admin/api/2022-04/shop.json";

	private static String Key = "X-Shopify-Access-Token";

	private static String Key_value = "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";

	@GetMapping("products")
	public ResponseEntity<Products> getAllProduct() {
		HttpHeaders headers = new HttpHeaders();

		headers.addIfAbsent(Key, Key_value);

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

		ResponseEntity<Products> products = restTemplate.exchange(GET_ALL_PROD, HttpMethod.GET, entity, Products.class);

		
		for(Product pro:products.getBody().getProducts())
			
			proRepo.save(pro);
			

		return products;

	}
	
	}
	