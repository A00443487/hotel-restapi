package com.pravin.hotelspringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Hotels {
	
	
	
	public Hotels() {
		// TODO Auto-generated constructor stub
	}
	
	public Hotels(String hotel_name,int price, boolean availablity){
		this.hotel_name=hotel_name;
		this.price=price;
		this.availablity=availablity;
		
	}
	public Hotels(String id,String hotel_name,int price, boolean availablity){
		this.hotel_name=hotel_name;
		this.price=price;
		this.availablity=availablity;
		this.id=id;
	}
		
	
	@Id
	private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailablity() {
		return availablity;
	}

	public void setAvailablity(boolean availablity) {
		this.availablity = availablity;
	}

	private String hotel_name;
	private int price;
	private boolean availablity;

}
