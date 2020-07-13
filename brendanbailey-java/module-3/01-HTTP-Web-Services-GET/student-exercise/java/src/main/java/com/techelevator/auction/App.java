package com.techelevator.auction;

import java.util.Scanner;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;


@SuppressWarnings("unused")
public class App {
									    // home URL for our server
    private static final String API_URL = "http://localhost:3000/auctions";
 // Define a RestTemplate object to make our API calls
    public static RestTemplate restTemplate = new RestTemplate();
    private static Scanner scanner;

    public static void main(String[] args) {
        init(); // what does init mean?
        run();
    }
    /**
     * Here to support testing
     */
    public static void init() {
        scanner = new Scanner(System.in);
    }

    public static Auction[] listAllAuctions() {
    	// Call the auction API to get all the auctions it knows about and pass it to printAuctions()
    	// The URL constructed is: http://localhost:3000/auctions 
    	// if the API_URL is already set to: "http://localhost:3000/auctions" do we still need
    	// the + "auctions", argument?
    	// printAuctions (restTemplate.getForObject(API_URL, Auction[].class));
		return restTemplate.getForObject(API_URL, Auction[].class);
    }
    
    public static Auction listDetailsForAuction() {
    	// need to use scanner to recieve user input for which auction id to return details for?
    	// code a try block and scanner.in here?
    	String input = scanner.nextLine();
    	
    	//printAuction(restTemplate.getForObject(API_URL + "auctions/id", Auction.class));
        return restTemplate.getForObject(API_URL + "/" + Integer.parseInt(input) , Auction.class);
    }

    public static Auction[] findAuctionsSearchTitle() {
        String input = scanner.nextLine();
        return restTemplate.getForObject(API_URL + "?title_like=" + input, Auction[].class);
    }

    public static Auction[] findAuctionsSearchPrice() {
        // api code here 
    	// 
        return null;
    }

    private static void run() {
        int menuSelection = 999;
        int id = 0;
        printGreeting();

        while (menuSelection != 5) {
            try {
                menuSelection = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Error parsing the input for menu selection.");
            }
            System.out.println("");
            if (menuSelection == 1) {
                printAuctions(listAllAuctions());
            } else if (menuSelection == 2) {
                printAuction(listDetailsForAuction());
            } else if (menuSelection == 3) {
                printAuctions(findAuctionsSearchTitle());
            } else if (menuSelection == 4) {
                printAuctions(findAuctionsSearchPrice());
            } else if (menuSelection == 5) {
                scanner.close();
                System.exit(0);
            
            } else {
                System.out.println("Invalid Selection");
            }
            menuSelection = 999;
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
            printGreeting();
        }
    }

    private static void printGreeting() {
        System.out.println("");
        System.out.println("Welcome to Online Auctions! Please make a selection: ");
        System.out.println("1: List all auctions");
        System.out.println("2: List details for specific auction");
        System.out.println("3: Find auctions with a specific term in the title");
        System.out.println("4: Find auctions below a specified price");
        System.out.println("5: Exit");
        System.out.println("");
        System.out.print("Please choose an option: ");
    }

    private static void printAuctions(Auction[] auctions) {
        if (auctions != null) {
            System.out.println("--------------------------------------------");
            System.out.println("Auctions");
            System.out.println("--------------------------------------------");
            for (Auction auction : auctions) {
                System.out.println(auction.currentBidToString());
            }
        }
    }

    private static void printAuction(Auction auction) {
        if (auction != null) {
            System.out.println("--------------------------------------------");
            System.out.println("Auction Details");
            System.out.println("--------------------------------------------");
            System.out.println("Id: " + auction.getId());
            System.out.println("Title: " + auction.getTitle());
            System.out.println("Description: " + auction.getDescription());
            System.out.println("User: " + auction.getUser());
            System.out.println("Current Bid: " + auction.getCurrentBid());
            System.out.println("");
        }
    }

}
