package com.restapi.hotel.hotelrestapi.model;

public class Guest {
	
	
	public Guest() {
		// TODO Auto-generated constructor stub
	}
	
	public Guest(String guest_name,String gender) {
this.guest_name=guest_name;
this.gender=gender;

	}
	public String getGuest_name() {
		return guest_name;
	}

	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}

	public String getGender() {
		return gender	;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	private String guest_name;
	private String gender;

}
