<template>
  <header>
    <div class="p-5 text-white text-3xl backcolor">
      <nav class="flex justify-between">
        <div>
          <img src="../images/logo.png" alt="" class="image" />
        </div>
        <div class="flex space-x-5 items-center">
          <div>
            <RouterLink to="/">Home</RouterLink>
          </div>
          <div>
            <RouterLink to="/user">User</RouterLink>
          </div>
          <div class="group relative">
            <RouterLink to="/freeboardlist">FreeBoard</RouterLink>
            <div
              class="opacity-0 group-hover:opacity-100 transition absolute bg-blue-800 p-5 top-8 -left-5 rounded"
            >
              <div>
                <RouterLink to="/freeboardlist">FreeBoardList</RouterLink>
              </div>
              <div>
                <RouterLink to="/freeboardinput">FreeBoardinput</RouterLink>
              </div>
            </div>
          </div>
          <div class="group relative">
            <RouterLink to="/fileupload">File</RouterLink>
            <div
              class="opacity-0 group-hover:opacity-100 transition absolute bg-blue-800 p-5 top-8 -left-5 rounded"
            >
              <div>
                <RouterLink to="/fileupload">FileupLoad</RouterLink>
              </div>
              <div>
                <RouterLink to="/filedownload">FileDownload</RouterLink>
              </div>
            </div>
          </div>
        </div>
        <template v-if="loginPinia.loginCheck">
          <div class="flex space-x-5 items-center">
            <h1>{{ loginPinia.name }}님</h1>
            <button @click="logout">Logout</button>
          </div>
        </template>
        <template v-else>
          <div class="flex space-x-5 items-center">
            <div>
              <router-link to="/join">Join</router-link>
            </div>
            <div>
              <router-link to="login">Login</router-link>
            </div>
          </div>
        </template>
      </nav>
    </div>
    <!-- {{ loginPinia.loginCheck }} -->
  </header>
</template>

<script setup>
import { doLoginCheck } from '@/api/loginApi';
import router from '@/router';
import { useLoginStore } from '@/store/loginPinia';
import { watchEffect } from 'vue';
import { RouterLink } from 'vue-router';

const loginPinia = useLoginStore();
const logout = () => {
  localStorage.removeItem('token');
  loginPinia.logout();
  router.push('login');
}

watchEffect(async () => {
  const result = await doLoginCheck();
  if (result == false) {
    loginPinia.logout();
  } else {
    console.log(result);
    if (result.status == 200) {
      loginPinia.login(result.data);
    } else if (result.status == 401) {
      localStorage.removeItem('token');
      loginPinia.logout();
    }
  }
});
</script>

<style scoped>
.image {
  width: 110px;
  height: 100px;
}
.backcolor {
  background-color: rgb(0, 20, 135);
}
</style>
