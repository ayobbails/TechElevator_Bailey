package com.techelevator.services;

import com.techelevator.models.Auction;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

public class AuctionService {

	private final String BASE_URL;
	public RestTemplate restTemplate = new RestTemplate();
	private final ConsoleService console = new ConsoleService();

	public AuctionService(String url) {
		BASE_URL = url;
	}

	public Auction[] getAll() {
		Auction[] auctions = null;
		try {
			auctions = restTemplate.getForObject(BASE_URL, Auction[].class);
		} catch (RestClientResponseException ex) {
			console.printError("Could not retrieve the auctions. Is the server running?");
		} catch (ResourceAccessException ex) {
			console.printError("A network error occurred.");
		}
		return auctions;
	}

	public Auction getOne(int id) {
		Auction auction = null;
		try {
			auction = restTemplate.getForObject(BASE_URL + "/" + id, Auction.class);
		} catch (RestClientResponseException ex) {
			console.printError("Could not retrieve the auction.");
		} catch (ResourceAccessException ex) {
			console.printError("A network error occurred.");
		}
		return auction;
	}

	public Auction[] getByTitle(String title) {
		Auction[] auctions = null;
		try {
			auctions = restTemplate.getForObject(BASE_URL + "?title_like=" + title, Auction[].class);
		} catch (RestClientResponseException ex) {
			console.printError("The title was not found. Please try again.");
		} catch (ResourceAccessException ex) {
			console.printError("A network error occurred.");
		}
		return auctions;
	}

	public Auction[] getByPrice(double price) {
		Auction[] auctions = null;
		try {
			auctions = restTemplate.getForObject(BASE_URL + "?currentBid_lte=" + price, Auction[].class);
		} catch (RestClientResponseException ex) {
			console.printError("No auctions found. Please try again.");
		} catch (ResourceAccessException ex) {
			console.printError("A network error occurred.");
		}
		return auctions;
	}

	public Auction add(String auctionString) {
		// method must create a new auction, use helper methods 
		// One makes an Auction object given a CSV string containing either three or four elements.
		// Second creates an HttpEntity with a content-type header set to JSON
		
		// make a new auction and http entity
		
		Auction anAuction = makeAuction(auctionString);

		if (anAuction == null) {
			System.out.println("Invalid reservation information entered, please retry");
		}
		// Send Auction object to the API to add it to Auction resource
		// HTTP POST request to add the auction
		HttpHeaders theHeaders = new HttpHeaders();
		theHeaders.setContentType(MediaType.APPLICATION_JSON); 
		HttpEntity anEntity = new HttpEntity(anAuction, theHeaders); 
		try {
			anAuction = restTemplate.postForObject(BASE_URL, anEntity, Auction.class);
		} catch (RestClientResponseException exceptionObject) {
			console.printError(exceptionObject.getMessage());
		}
		return anAuction; // must return an Auction object
	}

	public Auction update(String auctionString) {
        // update existing auction
    	// override the existing auction with the updated one
    Auction anAuction = makeAuction(auctionString);
    
    if (anAuction == null) {
    	System.out.println("Invalid auction information entered, please retry");
    	return null;
    }
    	HttpHeaders theHeaders = new HttpHeaders(); 		   // Define an object to hold the header information for the request
    	theHeaders.setContentType(MediaType.APPLICATION_JSON); // Include in the headers that we are sending JSON formatted data
    	
     // An HttpEntity is an object with properly formatted components of a request
    	// We use HttpEntity so we dont have to know how to properly format the components of the request
    
    	HttpEntity anEntity = new HttpEntity(anAuction, theHeaders);
   
   try {
    	restTemplate.put(BASE_URL, "/" + anAuction.getId(), anEntity, Auction.class);	
    }
    catch (RestClientResponseException exceptionObject) {
    	console.printError(exceptionObject.getRawStatusCode() + exceptionObject.getStatusText());
    }
    catch (ResourceAccessException exceptionObject) {
    	console.printError(exceptionObject.getMessage());
    }
        return anAuction; // must return an Auction object
    }

	public boolean delete(int id) {
		// removes an auction from the system
		// what happens if you enter an ID for an auction that doesnt exist?
		try {
			restTemplate.delete(BASE_URL + "/" + id);
		} catch (RestClientResponseException exceptionObject) {
			console.printError(exceptionObject.getRawStatusCode() + exceptionObject.getStatusText());
		} catch (ResourceAccessException exceptionObject) {
			console.printError(exceptionObject.getMessage());
		}
		return true; // doesnt return anything
	}

	private HttpEntity<Auction> makeEntity(Auction auction) {
		// set up Headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Auction> entity = new HttpEntity<>(auction, headers);
		return entity;
	}

	private Auction makeAuction(String CSV) {
		String[] parsed = CSV.split(",");
		// invalid input
		if (parsed.length < 4 || parsed.length > 5) {
			return null;
		}
		// Add method does not include an id and only has 5 strings
		if (parsed.length == 4) {
			// Create a string version of the id and place into an array to be concatenated
			String[] withId = new String[6];
			Auction[] auctions = getAll();
			if (auctions == null) {
				return null; // Some exception or other problem occurred.
			}
			String[] idArray = new String[] { auctions.length + 1 + "" };
			// place the id into the first position of the data array
			System.arraycopy(idArray, 0, withId, 0, 1);
			System.arraycopy(parsed, 0, withId, 1, 4);
			parsed = withId;
		}
		return new Auction(Integer.parseInt(parsed[0].trim()), parsed[1].trim(), parsed[2].trim(), parsed[3].trim(),
				Double.parseDouble(parsed[4].trim()));
	}

}
