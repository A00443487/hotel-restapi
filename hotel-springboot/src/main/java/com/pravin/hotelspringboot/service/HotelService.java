package com.pravin.hotelspringboot.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pravin.hotelspringboot.model.Guest;
import com.pravin.hotelspringboot.model.HotelReservations;
import com.pravin.hotelspringboot.model.Hotels;


@Service
public class HotelService {
	
	
	
	public static ResponseEntity<?> ListAllHotels(){
		
		//List<Hotels> hotelList=	hotelRepo.findAll();
		
		
		List<Hotels> hotelList=	new ArrayList<Hotels>();

		hotelList.add(new Hotels("1","Crown plaza",450,true));
		hotelList.add(new Hotels("2","Hampton",122,false));
		hotelList.add(new Hotels("3","Hotel Halifax",182,true));
		hotelList.add(new Hotels("4","Barrington Hotel",512,true));
		hotelList.add(new Hotels("5","Atlantic Hotel",812,false));
		hotelList.add(new Hotels("6","Hotel Hollis",129,true));
		hotelList.add(new Hotels("7","Dalhousie open residency",212,true));
		hotelList.add(new Hotels("8","SMU Residence",322,false));
		hotelList.add(new Hotels("9","Hotel George",92,true));
		hotelList.add(new Hotels("10","Hotel York",132,false));
		
		if(hotelList.size() > 0) {
			
			return new ResponseEntity<List<Hotels>>(hotelList,HttpStatus.OK);
			
		}else {
			return new ResponseEntity<>("No data found in hotelList", HttpStatus.NOT_FOUND);
		}
		
		
		
		
	}
	
	public static String hotelReservation(HotelReservations hotelReservation){
		try {
		
		if(hotelReservation.getCheckin() == null || hotelReservation.getCheckout() == null || hotelReservation.getHotel_name() == null || hotelReservation.getGuests_list().isEmpty()) {

			return "Information is inappropriate, hotel is not booked. Thank you!";
		}
		
		

			
		
		}catch(Exception e) {
			return "Information is inappropriate, hotel is not booked. Thank you!";
		}
		
		try {
			
			String confirmationCode="";
			
			ResponseEntity<HotelReservations> hl= new ResponseEntity<HotelReservations>(hotelReservation,HttpStatus.OK);
			if(hl !=null) {
				int otp = (int)(Math.random()*(9999-1000+1)+1000);  
				confirmationCode = hotelReservation.getHotel_name()+"_"+otp;
				return confirmationCode;
				
			}
				
			return null;
			
			
			
		}catch(Exception e) {

			return null;
		}
		
	}


}


