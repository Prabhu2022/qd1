package com;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;



public class Product {
	
	private long id ;
	private String title ;
	private String body_html ;
	private String vendor ;
	private String product_type ;
	private Date created_at ;
	private String handle ;
	private Date updated_at ;
	private Date published_at ;
	private String template_suffix ;
	private String status ;
	private String published_scope ;
	private String tags ;
	private String admin_graphql_api_id ;
	private ArrayList<Varient> variants ;
	private ArrayList<Images> images;
	
		
	public Product() {
		super();
	}


	public long getId() {
		
		//System.out.println("prabhu "+ id);
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		
		System.out.println("prabhu title " +title);
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getBody_html() {
		return body_html;
	}


	public void setBody_html(String body_html) {
		this.body_html = body_html;
	}


	public String getVendor() {
		return vendor;
	}


	public void setVendor(String vendor) {
		this.vendor = vendor;
	}


	public String getProduct_type() {
		return product_type;
	}


	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}


	public Date getCreated_at() {
		return created_at;
	}


	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}


	public String getHandle() {
		return handle;
	}


	public void setHandle(String handle) {
		this.handle = handle;
	}


	public Date getUpdated_at() {
		return updated_at;
	}


	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}


	public Date getPublished_at() {
		return published_at;
	}


	public void setPublished_at(Date published_at) {
		this.published_at = published_at;
	}


	public String getTemplate_suffix() {
		return template_suffix;
	}


	public void setTemplate_suffix(String template_suffix) {
		this.template_suffix = template_suffix;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getPublished_scope() {
		return published_scope;
	}


	public void setPublished_scope(String published_scope) {
		this.published_scope = published_scope;
	}


	public String getTags() {
		return tags;
	}


	public void setTags(String tags) {
		this.tags = tags;
	}


	public String getAdmin_graphql_api_id() {
		return admin_graphql_api_id;
	}


	public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
		this.admin_graphql_api_id = admin_graphql_api_id;
	}


	public ArrayList<Varient> getVariants() {
		return variants;
	}


	public void setVariants(ArrayList<Varient> variants) {
		this.variants = variants;
	}


	public ArrayList<Images> getImages() {
		return images;
	}


	public void setImages(ArrayList<Images> images) {
		this.images = images;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", body_html=" + body_html + ", vendor=" + vendor
				+ ", product_type=" + product_type + ", created_at=" + created_at + ", handle=" + handle
				+ ", updated_at=" + updated_at + ", published_at=" + published_at + ", template_suffix="
				+ template_suffix + ", status=" + status + ", published_scope=" + published_scope + ", tags=" + tags
				+ ", admin_graphql_api_id=" + admin_graphql_api_id + ", variants=" + variants + ", images=" + images
				+ "]";
	}

	
}
