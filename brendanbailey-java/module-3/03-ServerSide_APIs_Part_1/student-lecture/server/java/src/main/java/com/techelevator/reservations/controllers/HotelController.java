package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// This holds controllers for this server app
// This is where we assign url paths to functions

@RestController // This tells the server there are Controllers in the this file
public class HotelController {

    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;

    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();
        this.reservationDAO = new MemoryReservationDAO(hotelDAO);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     *
     * Function to handle GET request with /hotels path in the server url
     *
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDAO.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     *
     * Function to handle GET request with /hotels/id path in the server url
     *
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDAO.get(id);
    }
// Write a controller to return all the reservations when we get the path "/reservations"
    @RequestMapping(path="/reservations", method = RequestMethod.GET)
    public List<Reservation> allReservations() {
    	return reservationDAO.findAll();
    }
//  Write a controller to add a reservation to our Reservation resource
// 	using the path /hotels/id/reservations for a POST request
//
//	http://localhost:8080/hotel/1/reservations - should add a reservation for hotel id 1
//
//	
//  The data for the new reservation will be in the body of the request since it a POST  
//    
//  Use the @RequestBody to get the reservation data
//	Use the @PathVariable to get the hotel id    
    
    @RequestMapping(path="hotels/{id}/reservations", method=RequestMethod.POST)
    public  Reservation addAReservation(@RequestBody Reservation aReservation 
    								   ,@PathVariable("id") int hotelId) 
    {
		return reservationDAO.create(aReservation, hotelId);																																				
    }
    
    
    
    
    
    
}
