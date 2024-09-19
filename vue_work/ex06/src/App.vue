<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>
    <div class="p-5 bg-slate-500 text-white text-3xl">
      <nav class="flex space-x-5">
        <div>
          <RouterLink to="/">Home</RouterLink>
        </div>
        <div>
          <RouterLink to="/user">User</RouterLink>
        </div>
        <div class="group relative">
          <RouterLink to="/freeboardlist">FreeBoard</RouterLink>
          <div class="opacity-0 group-hover:opacity-100 absolute bg-slate-400 p-5 top-14 -left-5 rounded-xl">
            <div>
              <RouterLink to="/freeboardlist">FreeBoardList</RouterLink>
            </div>
            <div>
              <RouterLink to="/freeboardinput">FreeBoardInput</RouterLink>
            </div>
          </div>
        </div>
      </nav>
    </div>
  </header>

  <RouterView />
</template>

<style scoped>
</style>