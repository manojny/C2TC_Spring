package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer {
	
	private Integer id;
	private String name;
	private String orderDetails;
	private String phone;
	private String email;
	
	
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer() {
		super();
	}
	public Customer(Integer id, String name, String orderDetails, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.orderDetails = orderDetails;
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orderDetails=" + orderDetails + ", phone=" + phone
				+ ", email=" + email + "]";
	}
	
	
}
