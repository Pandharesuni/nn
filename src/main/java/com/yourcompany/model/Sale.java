package com.yourcompany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long saleId;
    private String shopDate;
    private String mobileNo;
    private String custName;
    private Long itemId;
    private String address;
    private String state;
    private String dateOfBirth;
    private boolean minor;
    private int quantity;
    private double price;
    private double payAmount;
    private String emailId;
	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", shopDate=" + shopDate + ", mobileNo=" + mobileNo + ", custName=" + custName
				+ ", itemId=" + itemId + ", address=" + address + ", state=" + state + ", dateOfBirth=" + dateOfBirth
				+ ", minor=" + minor + ", quantity=" + quantity + ", price=" + price + ", payAmount=" + payAmount
				+ ", emailId=" + emailId + ", getSaleId()=" + getSaleId() + ", getShopDate()=" + getShopDate()
				+ ", getMobileNo()=" + getMobileNo() + ", getCustName()=" + getCustName() + ", getItemId()="
				+ getItemId() + ", getAddress()=" + getAddress() + ", getState()=" + getState() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", isMinor()=" + isMinor() + ", getQuantity()=" + getQuantity() + ", getPrice()="
				+ getPrice() + ", getPayAmount()=" + getPayAmount() + ", getEmailId()=" + getEmailId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Long getSaleId() {
		return saleId;
	}
	public void setSaleId(Long saleId) {
		this.saleId = saleId;
	}
	public String getShopDate() {
		return shopDate;
	}
	public void setShopDate(String shopDate) {
		this.shopDate = shopDate;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isMinor() {
		return minor;
	}
	public void setMinor(boolean minor) {
		this.minor = minor;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

    // Getters and setters
}
