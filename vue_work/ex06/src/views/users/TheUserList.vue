<template>
  <div class="overlay" :class="{ isModal: isModal }"></div>
  <div class="modal p-5 rounded" :class="{ isModal: isModal }">
    <h1 class="text-5xl text-blue-800 text-center"><b>USER 수정</b></h1>
    <div class="cursor-pointer p-5 m-5 rounded-2xl w-80 bg-blue-800 text-white">
      <h1>idx = {{ idx }}</h1>
      <h1>name = <input type="text" v-model="name" class="border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-blue-500 text-gray-700"></h1>
      <h1>email = {{ email }}</h1>
      <h1>가입날짜 = {{ wdate }}</h1>
    </div>
    <div class="flex space-x-10 justify-center">
      <button
        @click="modalUser('save')"
        class="px-4 py-2 bg-blue-800 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300"
      >
        저장
      </button>
      <button
        @click="modalUser"
        class="px-4 py-2 bg-blue-800 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300"
      >
        취소
      </button>
    </div>
  </div>
  <div class="pb-10">
    <h1 class="h1-blue">UserList</h1>
    <div class="flex flex-wrap">
      <div
        @click="modalUser(item)"
        class="cursor-pointer p-5 m-5 rounded-2xl w-80 bg-blue-800 text-white"
        v-for="item in arr"
        :key="item.idx"
      >
        <h1>idx = {{ item.idx }}</h1>
        <h1>name = {{ item.name }}</h1>
        <h1>email = {{ item.email }}</h1>
        <h1>가입날짜 = {{ item.wdate }}</h1>
        <h1>작성한 글 = {{ item.list.length }}</h1>
        <button @click.stop="doDelete(item.idx)">삭제</button>
      </div>
    </div>
  </div>
</template>

<script setup>
import { deleteUsers, getUsers, saveUsers } from '@/api/userApi';
import { ref, watchEffect } from 'vue';

const arr = ref([]);

const idx = ref();
const name = ref();
const wdate = ref();
const email = ref();

const isModal = ref(false);

const doDelete = async (idx)=>{
  await deleteUsers(idx);
  const retValue = await getUsers();
  arr.value = retValue.data;
}

const modalUser = async (item) => {
  isModal.value = !isModal.value;

  if(item == 'save'){
    await saveUsers({ idx:idx.value, name:name.value, email:email.value, password:"마이패스워드" });
    alert('수정 완료....');
    const retValue = await getUsers();
    arr.value = retValue.data;
    return;
  }

  idx.value = item.idx;
  name.value = item.name;
  wdate.value = item.wdate;
  email.value = item.email;
};

watchEffect(async () => {
  const retValue = await getUsers();
  //   console.log("retvalue = "+JSON.stringify(retValue.data));
  arr.value = retValue.data;
  // console.log(arr.value);
});
</script>

<style scoped>
.h1-blue {
  font-size: 5rem;
  color: blue;
  text-align: center;
}
.overlay {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1000;
  background-color: rgb(245, 245, 220, 0.5);
  display: none;
}
.modal {
  position: fixed;
  top: 50%;
  left: 50%;
  background-color: white;
  /* border-radius: 2rem; */
  z-index: 1001;
  transform: translate(-50%, -50%);
  display: none;
}
.isModal {
  display: block;
}
</style>
