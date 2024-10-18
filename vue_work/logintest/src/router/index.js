import { createRouter, createWebHistory } from 'vue-router'
import LoginMain from '@/views/LoginMain.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'main',
      component: LoginMain,
    },
  ],
})

export default router
