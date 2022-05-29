package com;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;


public class ProductDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	    public int[] batchInsert(List<Product> products) {

	        return this.jdbcTemplate.batchUpdate(
				"insert into product (id,title,vendor,product_type,created_at) values(?,?,?,?,?)",
				new BatchPreparedStatementSetter() {


					

					@Override
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						
						ps.setLong(1, products.get(i).getId());
						ps.setString(2, products.get(i).getTitle());
						ps.setString(3, products.get(i).getVendor());
						ps.setString(4, products.get(i).getProduct_type());
						ps.setDate(5, (Date) products.get(i).getCreated_at());
						
					}
					public int getBatchSize() {
						return products.size();
					}
				});
	    }

}
