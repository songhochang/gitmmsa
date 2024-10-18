import { createRouter, createWebHistory } from 'vue-router';
import TheHome from '@/views/TheHome.vue';
import TheUserList from '@/views/users/TheUserList.vue';

import TheFreeBoardInput from '@/views/freeboard/TheFreeBoardInput.vue';
import TheFreeBoardList from '@/views/freeboard/TheFreeBoardList.vue';
import TheFreeBoardView from '@/views/freeboard/TheFreeBoardView.vue';
import TheFreeBoardUpdate from '@/views/freeboard/TheFreeBoardUpdate.vue';

import TheFileUpload from '@/views/file/TheFileUpload.vue';
import TheFileDownload from '@/views/file/TheFileDownload.vue';

import TheJoin from '@/views/login/TheJoin.vue';
import TheLogin from '@/views/login/TheLogin.vue';

const router = createRouter({
  history: createWebHistory('/'),
  routes: [
    {
      path: '/',
      name: 'home',
      component: TheHome
    },
    {
      path: '/user',
      name: 'user',
      component: TheUserList
    },
    {
      path: '/freeboardinput',
      name: 'freeboardinput',
      component: TheFreeBoardInput
    },
    {
      path: '/freeboardupdate',
      name: 'freeboardupdate',
      component: TheFreeBoardUpdate
    },
    {
      path: '/freeboardlist',
      name: 'freeboardlist',
      component: TheFreeBoardList
    },
    {
      path: '/freeboardview/:idx',
      name: 'freeboardview',
      component: TheFreeBoardView
    },
    {
      path: '/fileupload',
      name: 'fileupload',
      component: TheFileUpload
    },
    {
      path: '/filedownload',
      name: 'filedownload',
      component: TheFileDownload
    },
    {
      path: '/join',
      name: 'join',
      component: TheJoin
    },
    {
      path: '/login',
      name: 'login',
      component: TheLogin
    }
  ]
});

export default router;