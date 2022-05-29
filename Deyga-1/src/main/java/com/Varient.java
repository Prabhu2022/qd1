package com;

import java.util.Date;

public class Varient extends Product {

	private long id ;
	private long product_id ;
	private String title ;
	private float price ;
	private String sku ;
	private String position ;
	private String inventory_policy ;
	private float compare_at_price ;
	private String fulfillment_service ;
	private String inventory_management ;
	private String option1 ;
	private String option2 ;
	private String option3 ;
	private Date created_at ;
	private Date updated_at ;
	private Boolean taxable ;
	private String barcode ;
	private String grams ;
	private String image_id ;
	private float weight ;
	private String weight_unit ;
	private long inventory_item_id ;
	private int inventory_quantity ;
	private int old_inventory_quantity ;
	private Boolean requires_shipping ;
	private String admin_graphql_api_id ;
	
	
	public Varient() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getInventory_policy() {
		return inventory_policy;
	}
	public void setInventory_policy(String inventory_policy) {
		this.inventory_policy = inventory_policy;
	}
	public float getCompare_at_price() {
		return compare_at_price;
	}
	public void setCompare_at_price(float compare_at_price) {
		this.compare_at_price = compare_at_price;
	}
	public String getFulfillment_service() {
		return fulfillment_service;
	}
	public void setFulfillment_service(String fulfillment_service) {
		this.fulfillment_service = fulfillment_service;
	}
	public String getInventory_management() {
		return inventory_management;
	}
	public void setInventory_management(String inventory_management) {
		this.inventory_management = inventory_management;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Boolean getTaxable() {
		return taxable;
	}
	public void setTaxable(Boolean taxable) {
		this.taxable = taxable;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getGrams() {
		return grams;
	}
	public void setGrams(String grams) {
		this.grams = grams;
	}
	public String getImage_id() {
		return image_id;
	}
	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getWeight_unit() {
		return weight_unit;
	}
	public void setWeight_unit(String weight_unit) {
		this.weight_unit = weight_unit;
	}
	public long getInventory_item_id() {
		return inventory_item_id;
	}
	public void setInventory_item_id(long inventory_item_id) {
		this.inventory_item_id = inventory_item_id;
	}
	public int getInventory_quantity() {
		return inventory_quantity;
	}
	public void setInventory_quantity(int inventory_quantity) {
		this.inventory_quantity = inventory_quantity;
	}
	public int getOld_inventory_quantity() {
		return old_inventory_quantity;
	}
	public void setOld_inventory_quantity(int old_inventory_quantity) {
		this.old_inventory_quantity = old_inventory_quantity;
	}
	public Boolean getRequires_shipping() {
		return requires_shipping;
	}
	public void setRequires_shipping(Boolean requires_shipping) {
		this.requires_shipping = requires_shipping;
	}
	public String getAdmin_graphql_api_id() {
		return admin_graphql_api_id;
	}
	public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
		this.admin_graphql_api_id = admin_graphql_api_id;
	}

	
}
