import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

// routes need at least two parts: 
//  the `path` and the `component` that it should load for that route
const routes = [
  {
  path: '/',
  name: 'home',
  component: Home
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
