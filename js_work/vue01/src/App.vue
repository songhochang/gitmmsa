<script setup>
const myarr = [{age:20,name:"홍길동"},{age:30,name:"고길동"},{age:40,name:"하길동"}];
</script>

<template>
  <h1>Vue웅신</h1>
  <div>{{ myarr }}</div>
  <div v-for="item in myarr" v-bind:key="item">
    <h1 style="color: skyblue;">나이 : {{ item.age }} 이름 : {{ item.name }} </h1>
  </div>
</template>

<style scoped>

</style>
