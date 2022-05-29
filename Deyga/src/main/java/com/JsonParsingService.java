package com;


import java.io.IOException;

import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonParsingService implements ParsingService {

	private Products products;
	
	@Override
	public Object parse(String result)
	{
		ObjectMapper objMap= new ObjectMapper();
				
		
				
		try {
			 products=objMap.readValue(result, Products.class); //error line
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
	
		
		
		return products;
	}

}
