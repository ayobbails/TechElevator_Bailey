package com.techelevator.reservations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Main server app - main() and @SpringBootApplication
// SpringBoot is a framework to implement REST server applications

@SpringBootApplication	// Tell SpringBoot that this is a server app
public class HotelReservationsApplication {

    public static void main(String[] args) {
      //SpringApplication.run() - Spring Boot method to start the server for the app
      //Pass .run the Class that is the application - HotelReservationsApplication	
    	SpringApplication.run(HotelReservationsApplication.class, args);
    }

}
