package com;

public class Employee {
	
	private Long id;
	private String name;
	private String dept;
	private String place;
	
	
	public Employee() {
		super();
	}
	public Employee(Long id,String name, String dept, String place) {
		super();
		this.id =id;
		this.name = name;
		this.dept = dept;
		this.place = place;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", place=" + place + "]";
	}
	
	
	
	

}
