package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepo {

	private String url = "jdbc:mysql://localhost:3306/qddb";
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String dbuser = "root";
	private String dbpass = "123456";

	
	public void loadDriver(String driver) {

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {

			con = DriverManager.getConnection(url, dbuser, dbpass);			
		}

		catch (SQLException e) {
		
			e.printStackTrace();
		}
		return con;
	}

	public Boolean insert(List<Product> product) {

		System.out.println("You Have Registered Successfully");

		boolean result = true;

		PreparedStatement ps;
		
		loadDriver(driver);
		Connection con = getConnection();

		String sql = "insert into product (id,title,vendor,product_type,created_at) values(?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);

			System.out.println(ps);
			
			System.out.println(product.getId());
			System.out.println(product.getTitle());
			
			ps.setLong(1, product.getId());
			ps.setString(2, product.getTitle());
			ps.setString(3,product.getVendor());
			ps.setString(4,product.getProduct_type());
			ps.setDate(5,(Date) product.getCreated_at());

			System.out.println(ps);
			
			ps.executeUpdate();

		}

		catch (SQLException ex) {
			ex.printStackTrace();
			result = false;
			
		}
		return result;
		
		

	}
	
}
