package com.pravin.hotelspringboot.model;

import java.util.List;

import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HotelReservations {

	public HotelReservations() {
		// TODO Auto-generated constructor stub
	}
	
	public HotelReservations(String hotel_name, String checkin, String checkout, List<Guest> guest_list) {
		super();
		this.hotel_name = hotel_name;
		this.checkin = checkin;
		this.checkout = checkout;
		this.guest_list = guest_list;
	}


	
	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	



	




	public List<Guest> getGuests_list() {
		return guest_list;
	}

	public void setGuests_list(List<Guest> guest_list) {
		this.guest_list = guest_list;
	}









	@JsonProperty("hotel_name")
	private String hotel_name;
	@JsonProperty("checkin")
	private String checkin;
	@JsonProperty("checkout")
	private String checkout;
	
	@Autowired
	@OneToMany
	@JsonProperty("guest_list")
	private List<Guest> guest_list;
	
	
}
