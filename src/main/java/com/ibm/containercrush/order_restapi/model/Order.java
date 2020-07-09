package com.ibm.containercrush.order_restapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {
	@Id
	private String id;

	private int orderId;
	private String brand;
	private String model;
	private int price;
	private String customerName;
	private String customerContactNum;
	private String cusotmerEmail;
	private String customerAddress;
	private String city;
	private String showroom;
	private String dealerContactNum;
	private String dealerEmail;

	public Order() {

	}
	
	

	public Order(int orderId, String brand, String model, int price, String customerName, String customerContactNum,
			String cusotmerEmail, String customerAddress, String city, String showroom, String dealerContactNum,
			String dealerEmail) {
		super();
		this.orderId = orderId;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.customerName = customerName;
		this.customerContactNum = customerContactNum;
		this.cusotmerEmail = cusotmerEmail;
		this.customerAddress = customerAddress;
		this.city = city;
		this.showroom = showroom;
		this.dealerContactNum = dealerContactNum;
		this.dealerEmail = dealerEmail;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerContactNum() {
		return customerContactNum;
	}

	public void setCustomerContactNum(String customerContactNum) {
		this.customerContactNum = customerContactNum;
	}

	public String getCusotmerEmail() {
		return cusotmerEmail;
	}

	public void setCusotmerEmail(String cusotmerEmail) {
		this.cusotmerEmail = cusotmerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getShowroom() {
		return showroom;
	}

	public void setShowroom(String showroom) {
		this.showroom = showroom;
	}

	public String getDealerContactNum() {
		return dealerContactNum;
	}

	public void setDealerContactNum(String dealerContactNum) {
		this.dealerContactNum = dealerContactNum;
	}

	public String getDealerEmail() {
		return dealerEmail;
	}

	public void setDealerEmail(String dealerEmail) {
		this.dealerEmail = dealerEmail;
	}



	@Override
	public String toString() {
		return "Order [id=" + id + ", orderId=" + orderId + ", brand=" + brand + ", model=" + model + ", price=" + price
				+ ", customerName=" + customerName + ", customerContactNum=" + customerContactNum + ", cusotmerEmail="
				+ cusotmerEmail + ", customerAddress=" + customerAddress + ", city=" + city + ", showroom=" + showroom
				+ ", dealerContactNum=" + dealerContactNum + ", dealerEmail=" + dealerEmail + "]";
	}

	
}