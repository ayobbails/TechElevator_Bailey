<template>
  <div id="app">
    <img alt="Vue" src="./assets/logo.png">
    <lunch-options></lunch-options>
  </div>
</template>

<script>
import LunchOptions from './components/LunchOptions.vue'

export default {
  name: 'App',
  components: {
    LunchOptions
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
