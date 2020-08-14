<!-- This is the start-up page for a Vue application -->
<!-- Should be called App.vue                        -->

<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <!-- Vue components are used like any other tag in the HTML -->
   
   <product-review></product-review>  <!-- added our component to the page using kabob case -->
  
  </div>
</template>

<script>
// import our Vue component file into the page

import ProductReview from './components/ProductReview.vue'

export default {
  name: 'App',
  components: { // List of components (file name) used in the page
    
    ProductReview
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
