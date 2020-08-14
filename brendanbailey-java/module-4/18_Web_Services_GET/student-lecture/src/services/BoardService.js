// API framework to make API calls from JavaScript
import axios from 'axios';

// use axios for our json server
const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {
// API calls are asynchronous calls - once the call is started your program continues
//  normal functions are synchronous calls - program does not continue until function return

// API calls issue a 'promise' back to you when you start them
//  the promise, I'll let you know when I am done
//  there is no way of knowing how long it will take the server to receive the HTTP request
//    process it and send back the response

// function to return all the data from the server defined to axios at the /boards path
  getBoards() {                 // getBoards returns immediately after sending calls to server with a promise
    return http.get('/boards'); // axios HTTP GET using path /boards - return the HTTP response data
  },

  getCards(boardID) {                     // Retrieve all the Cards for a board given the boardID
    return http.get(`/boards/${boardID}`) // notice `` around URL - due to it having EL expression
  },                                      //  substitute a variable in a string

  async getCard(boardID, cardID) {        // Retrieve on Card given the boardID and cardID
    const response = await http.get(`/boards/${boardID}`);
    const cards = response.data.cards;
    return cards.find(card => card.id == cardID);
  }

}
