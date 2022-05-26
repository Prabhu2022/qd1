package com;


import java.io.IOException;

import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class JsonParsingService implements ParsingService {


	@Override
	public Object parse(String result) {
		ObjectMapper objMap= new ObjectMapper();
		
		Products products =new Products();
		
		//Deyga shop = new Deyga();
				
		try {
			products=objMap.readValue(result, Products.class);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
	
		System.out.println(products.getProducts());
		
		return products;
	}

}
