// this is the index.js for the router

import Vue       from 'vue'              // access the Vue stuff
import VueRouter from 'vue-router'       // access the Vue Router stuff
import Products  from '@/view/Products'  // access Products.vue stuff

Vue.use(VueRouter)    // Tell Vue we are using the Vue router

// Array of router route information
const routes = [         // Associate the URL paths to a router view
  { // an object with the properties related to the path/view
    path: '/',           // URL path to be associated with the router view
    name: 'products',    // name for this path/view combination
    component: Products // view router component associated with the path
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  
})

export default router
