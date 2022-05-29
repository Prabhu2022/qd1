package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int save(Product product) {

		//System.out.println("prabhu save" + product.getId() + product.getTitle());

		return jdbcTemplate.update("INSERT INTO product (id,title,vendor,product_type,created_at) VALUES(?,?,?,?,?)",
				new Object[] { product.getId(), product.getTitle(), product.getVendor(), product.getProduct_type(),
						product.getCreated_at() });
	}

	public int update(Product product) {
		return jdbcTemplate.update("UPDATE product SET title=?, vendor=?,product_type=?,created_at=? WHERE id=?", 
				new Object[] { product.getId(),
				product.getTitle(), product.getVendor(), product.getProduct_type(), product.getCreated_at() });
	}

	public Product findById(Long id) {
		try {
			Product product = jdbcTemplate.queryForObject("SELECT * FROM product WHERE id=?",
					BeanPropertyRowMapper.newInstance(Product.class), id);
			System.out.println("Single product"+product);
			return product;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	public int deleteById(Long id) {
		return jdbcTemplate.update("DELETE FROM product WHERE id=?", id);
	}

	public List<Product> findAll() {
		return jdbcTemplate.query("SELECT * from product", BeanPropertyRowMapper.newInstance(Product.class));

	}

	public List<Product> findByTitleContaining(String title) {
		String q = "SELECT * from videos WHERE title ILIKE '%" + title + "%'";
		return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Product.class));
	}

	public int deleteAll() {
		return jdbcTemplate.update("DELETE from product");
	}
	public int viewDbData() {
		return jdbcTemplate.update("SELECT from product");
	}
	
}
