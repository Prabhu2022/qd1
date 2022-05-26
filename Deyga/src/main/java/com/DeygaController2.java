package com;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class DeygaController2 {
	
	static RestTemplate restTemplate = new RestTemplate();
	
	private static final String GET_ALL_PROD = "https://deyga-testing-store.myshopify.com/admin/api/2022-04/products.json";
	private static final String GET_SINGLE_PROD ="https://deyga-testing-store.myshopify.com/admin/api/2022-04/products/{product_id}.json";
	
	private static String Key = "X-Shopify-Access-Token";
	
	private static String Key_value = "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";
	
	private static final String TEST="https://restcountries.com/v3.1/name/india";
	
	public static void main(String args[])
	{
		getAllProducts();
	}
	
	public static void getAllProducts()
	{
		HttpHeaders headers = new HttpHeaders();
		
		headers.addIfAbsent(Key, Key_value);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<String> entity = new HttpEntity<>("parameters",headers);
		
		ResponseEntity<String> result = restTemplate.exchange(GET_ALL_PROD, HttpMethod.GET, entity, String.class);
		
		System.out.println(result);
		
		
	}
	
	public static void getProductById()
	{
		Map<String, Integer> param = new HashMap<>();
		param.put("id", 1);
		
		User user = restTemplate.getForObject(GET_SINGLE_PROD, User.class, param);
		
		System.out.println(user.getName());
		System.out.println(user.getFullName());
		
		
	}
}
