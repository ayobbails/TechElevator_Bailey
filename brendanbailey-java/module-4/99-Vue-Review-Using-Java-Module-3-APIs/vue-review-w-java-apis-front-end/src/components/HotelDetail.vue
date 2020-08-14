<!-- this will display the details for a hotel  -->
<!-- 1. Get the hotel to be displayed.          -->
<!-- 2. Include the hotel detail in the page    -->
<template>
    <div>
        <h1>{{ hotel.name }} Details</h1>

        <div>
           <router-link to="/">Return to Home</router-link>
        </div> 
    </div>
         
</template>
<script>
import HotelServices from "@/services/HotelServices"
export default {
    name: "hotel-detail",
       data() {
        return { 
            
            hotel: { // hold the hotel whose details we are displaying
                     hotelID: 1,
                     name: "The Squirrel Den"
                    }
        } // End of return for data()
    }, // End of data()
    
    created() { // get the hotel whose details are to be displayed
    // We have two ways to get a specific hotel:
    
    //  1. We can get it from the Data Store: this.$store.state.hotels.filter
    //      Pro: we already have the data from the API - no API call overhead
    //      Con: if the details have changed since we got the data we dont have the change
    
    //  2. We can call the API to get a single hotel
    //      a. Add a service to make the API call
    //      b. Call the service to get the hotel
    //      c. Copy the data from the API response to our hotel property
    //       Pro: we get the most up to date information
    //       Con: we are doing an API call, which takes time
    
    }
}


</script>
<style scoped>

</style>