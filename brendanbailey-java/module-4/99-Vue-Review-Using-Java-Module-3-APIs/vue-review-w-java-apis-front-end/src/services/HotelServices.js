import axios from "axios";

const hotelAPI = axios.create({
  // create an axios object
  baseURL: "http://localhost:8080"
});

export default { //  function defined in our service
  getHotels() {
    return hotelAPI.get("/hotels");
  },
  // API call 
  getHotel(id) {
    return hotelAPI.get(`/hotels/${id}`)
  }
};
