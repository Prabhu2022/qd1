package com;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringJdbcTest {

	public static void main(String[] args) {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/qddb");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		
		JdbcTemplate template = new JdbcTemplate(dataSource);
		
		String sql = "INSERT INTO employee (Name ,Dept, Place) VALUES (?,?,?)";
		
		String sql1 = "UPDATE employee SET Dept= ? WHERE Id= ?";
		
		String sql2 = "DELETE FROM employee WHERE id= ?";
		
		int result= template.update(sql,"vicky","dp","chennai");
		//int result= template.update(sql2,"rms","2");
		//int result= template.update(sql2,"2");
		
		if(result>0) {
			System.out.println("The new emp has been Created.");
			//System.out.println("The emp has been Updated.");
			//System.out.println("The emp has been Deledated.");
		}
	
		
		String sql3="SELECT * FROM employee";
		
		
		RowMapper<Employee> rowMapper = new RowMapper<Employee>() {
			
			
			public Employee mapRow(ResultSet res, int rowNum) throws SQLException {
				Long id=res.getLong("id");
				String name=res.getString("name");
				String dept=res.getString("dept");
				String place=res.getString("place");
				
				return new Employee(id,name,dept,place);
			}
		};
		
		List<Employee> emp=template.query(sql3, rowMapper);
		for(Employee em:emp)
		{
			System.out.println(em);
		}
		
	}	
			
			
}
