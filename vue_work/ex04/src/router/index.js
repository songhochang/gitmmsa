import {createRouter,createWebHistory} from 'vue-router'
import TheHome from '../../views/TheHome.vue';
import TheSignUp from '../../views/TheSignUp.vue';
import TheAbout from '../../views/TheAbout.vue';

const router = createRouter({
    history:createWebHistory(),
    routes:[{path:'/',component: TheHome},{path:'/sign-up',component:TheSignUp},{path:'/about',component:TheAbout}]
});

export default router;