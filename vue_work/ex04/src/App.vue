<template>
  <div>
    <div class="flex items-center justify-center">
    <h1>{{ myVar }}</h1>
    <TheHeader/>
    <RouterView></RouterView>
  </div>
  </div>
</template>

<script setup>
import TheHeader from './components/TheHeader.vue';
import { RouterView } from 'vue-router';

const myVar = "HELLO"

</script>

<style lang="scss" scoped>

</style>