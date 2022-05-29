package com;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcProductRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	public int save(Product product) {

		System.out.println("prabhu save" + product.getId() + product.getTitle());

		return jdbcTemplate.update(
				"INSERT INTO product (id,title,vendor,product_type,created_at) VALUES(?,?,?,?,?)",
				new Object[] { product.getId(), product.getTitle(), product.getVendor(), product.getProduct_type(),
						product.getCreated_at() });
	}

	
}
