package com.restapi.hotel.hotelrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.hotel.hotelrestapi.model.HotelReservations;
import com.restapi.hotel.hotelrestapi.service.HotelService;
import java.util.*;
@RestController
public class HotelController {
	
	
	
	@GetMapping(path = "/hotel-list")
	public ResponseEntity<?> getListOfHotels(){
		return HotelService.ListAllHotels();
		
	}
	

	
	
	@PostMapping(path = "/hotel-reservation")
	public String reservationConfirmation(@RequestBody HotelReservations hotelReservation){
		/*Guest g1= new Guest("pravin","male");
		Guest g2= new Guest("bhavani","female");
		List<Guest> gl= new ArrayList<Guest>();
		gl.add(g1);
		gl.add(g2);
		HotelReservations rs = new HotelReservations("Hampton", "12:23", "01:23", gl);
		*/
		
		
		return HotelService.hotelReservation(hotelReservation);
		
	}

}
