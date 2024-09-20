<template>
    <div class="pb-10">
      <h1 class="h1-red">FreeBoardList</h1>
      <div>
      <table class="border border-b-gray-500 w-full">
        <thead>
            <tr>
                <th class="border">IDX</th>
                <th class="border">title</th>
                <th class="border">author</th>
                <th class="border">regdate</th>
                <th class="border">viewcount</th>
            </tr>
        </thead>
        <tbody>
            <tr v-for="item in arr" :key="item.idx" class="cursor-pointer hover:bg-sky-200" @click="viewPage(item.idx)">
                <td class="border text-center text-2xl">{{ item.idx }}</td>
                <td class="border text-center text-2xl">{{ item.title }}</td>
                <td class="border text-center text-2xl">{{ item.creAuthor }}</td>
                <td class="border text-center text-2xl">{{ item.regDate }}</td>
                <td class="border text-center text-2xl">{{ item.viewCount }}</td>
            </tr>
        </tbody>
      </table>
      </div>
      <div class="flex justify-center mt-5">
        <ul class="flex space-x-2">
            <li class="cursor-pointer p-3" v-for="num in totalPages" v-bind:key="num" @click="setPageNum(num-1)">{{ num }}</li>
        </ul>
      </div>
    </div>
  </template>
  
<script setup>
import axios from 'axios';
import { ref } from 'vue'
import { useRouter } from 'vue-router';

const arr = ref([]);
const totalPages = ref(10);
const pageNum = ref(0)

const router = useRouter();

const setPageNum = (num)=>{
    pageNum.value = num;
    getFreeBoard(num);
}

const viewPage = (idx)=>{
    const data = {name:'freeboardview',params:{idx}};
    router.push(data);
}

const getFreeBoard = (pageNum)=>{
    if(pageNum==undefined){ pageNum = 0;}
    axios.get(`http://localhost:8080/freeboard?pageNum=${pageNum}`)
.then(res=>{
    arr.value = res.data.list;
    totalPages.value = res.data.totalPages;
})
.catch(e=>{
    console.log(e);
})
}

getFreeBoard();

</script>
  
<style scoped>
 
</style>