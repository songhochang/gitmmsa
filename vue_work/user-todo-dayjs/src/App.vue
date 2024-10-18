<script setup>
import { RouterLink, RouterView } from 'vue-router'
import dayjs from 'dayjs';

const date = new Date();
console.log(date);

const now = dayjs();
console.log(now);
console.log(now.format('YYYY-MM-DD HH:mm:ss'));
console.log(now.format('YYYY-MM-DD HH'));
</script>

<template>
  <header>
    <h1 class="text-5xl">ToDo_List</h1>
    <h1 class="text-5xl">{{ now.format('YYYY/MM/DD') }}</h1>
    <h1 class="text-5xl">{{ now.get('month')+1 }}월</h1>
  </header>

  <RouterView />
</template>

<style scoped>

</style>
