import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'    // Use router view called Home
import Board from '../views/Board.vue'  // Use router view called Board
import Card from '../views/Card.vue'    // Use router view called Card

Vue.use(VueRouter)

const routes = [ // Paths and associated views the router is aware of
  { // When the '/' url path is sent to the router it will use the Home.vue                                                                                                          
    path: '/',        // URL
    name: 'Home',     // name for the path/view connection
    component: Home   // router view associated with path
  },
  {
    path: '/board/:id', // URL may be used in router-link to indicate this path
    name: 'Board',      // name that may be used in router-link to indicate this path
    component: Board
  },
  {
    path: '/board/:boardID/card/:cardID', // Two path variables
    name: 'Card',
    component: Card
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes                      // name of the path/view association object
})

export default router
