<script setup>
import { RouterLink, RouterView } from 'vue-router';
</script>

<template>
  <header>
    <div class="p-5 bg-blue-800 text-white text-3xl">
      <nav class="flex justify-between">
        <div>
          <img src="../src/images/logo.png" alt="" class="image">
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
          <div>
            <RouterLink to="/fileupload">fileupload</RouterLink>
          </div>
          <div>
            <RouterLink to="/filedownload">filedownload</RouterLink>
          </div>
        </div>
        <div class="flex space-x-5 items-center">
          <div>
            <router-link to="/join">Join</router-link>
          </div>
          <div>
            <router-link to="login">login</router-link>
          </div>
        </div>
      </nav>
    </div>
  </header>

  <RouterView />
</template>

<style scoped>
.image{
  width: 110px;
  height: 100px;
}
</style>
