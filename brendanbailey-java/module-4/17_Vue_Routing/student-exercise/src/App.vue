<template>
  <div id="app">
    <!-- Implemented navigation in a <nav> element with a link to the `Home` view and a link to the `MyBooks` view -->
    <nav>
      <router-link v-bind="{name: 'home'}">Home</router-link>
      <router-link v-bind="{name: 'myBooks'}">My Books</router-link>  
    </nav>  
    <router-view />  
  </div>
</template>

<script>

export default {
  name: 'app'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 60px;
}
</style>
