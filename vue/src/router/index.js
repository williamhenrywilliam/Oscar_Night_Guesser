import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import OscarsView from '../views/OscarsView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/oscars',
    name: 'oscars',
    component: OscarsView
  }
]

const router = new VueRouter({
  routes
})

export default router
