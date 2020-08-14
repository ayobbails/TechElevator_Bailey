import axios from 'axios';

const http = axios.create({         // Define an object to interact with axios 
  baseURL: "http://localhost:3000"  //  and give it the base API server path
});

export default {

  getBoards() {
    return http.get('/boards');
  },

  getCards(boardID) {
    return http.get(`/boards/${boardID}`)
  },

  getCard(cardID) {
    return http.get(`/cards/${cardID}`)
  },

  addCard(card) {
    return http.post('/cards', card);
  },

  updateCard(card) {
    return http.put(`/cards/${card.id}`, card);
  },

  deleteCard(cardID) {
    return http.delete(`/cards/${cardID}`);
  }

}
