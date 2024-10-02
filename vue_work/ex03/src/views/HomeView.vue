<template>
  <div>
    <h1>HOME</h1>
    <div class="p-5">
    <table class="border border-gray-500 w-full">
      <tr>
        <th class="border border-gray-500">idx</th>
        <th class="border border-gray-500">name</th>
        <th class="border border-gray-500">age</th>
        <th class="border border-gray-500">email</th>
        <th class="border border-gray-500">password</th>
        <th class="border border-gray-500">wdate</th>
      </tr>
      <tr v-for="user in list" v-bind:key="user.idx">
        <td class="border border-gray-500">{{ user.idx }}</td>
        <td class="border border-gray-500">{{ user.name }}</td>
        <td class="border border-gray-500">{{ user.age }}</td>
        <td class="border border-gray-500">{{ user.email }}</td>
        <td class="border border-gray-500">{{ user.password }}</td>
        <td class="border border-gray-500">{{ user.wdate }}</td>
      </tr>
    </table>
    <button @click="select" class="bg-yellow-200 p-3 m-3 hover:bg-yellow-100 border border-gray-300">불러오기</button>
    <div v-for="num in mylist" v-bind:key="num">
      num = {{ num }}
    </div>
    <div class="p-5">
      name = <input class="bg-blue-100 border border-blue-300 rounded-lg p-2 shadow-md focus:outline-none focus:ring-2 focus:ring-blue-400" type="text" name="name" id="" v-model="name"><br>
      age = <input class="bg-blue-100 border border-blue-300 rounded-lg p-2 shadow-md focus:outline-none focus:ring-2 focus:ring-blue-400" type="number" name="name" id="" v-model="age"><br>
      password = <input class="bg-blue-100 border border-blue-300 rounded-lg p-2 shadow-md focus:outline-none focus:ring-2 focus:ring-blue-400" type="text" name="name" id="" v-model="password"><br>
      email = <input class="bg-blue-100 border border-blue-300 rounded-lg p-2 shadow-md focus:outline-none focus:ring-2 focus:ring-blue-400" type="text" name="name" id="" v-model="email"><br>
      <button @click="insert" class="bg-yellow-200 p-3 m-3 hover:bg-yellow-100 border border-gray-300">입력</button>
    </div>
  </div>
  </div>
</template>

<script>
import { ref } from 'vue';

export default {
  setup () {
    const mylist = [10,20,30];
    const list = ref([
    {
        "idx": 1,
        "name": "아아아아꿔바꿔바",
        "age": 21,
        "email": "33@yahoo.com",
        "password": "qwer",
        "wdate": "2024-09-06T11:32:44.718893"
    }
    ]);

    const name = ref('');
    const age = ref('');
    const password = ref('');
    const email = ref('');
    const wdate = ref('');

    const select = () => {
      fetch(`http://192.168.0.29:8080/user/select`).then(res=>{
      return res.json();
    })
    .then(result =>{
      list.value = result;
      console.log(result);
    })
    .catch(e=>{
      console.log("예외발생");
      console.log(e);
    })
    }
    const insert = () => {
      const data = {
        name:name.value,
        age:age.value,
        password:password.value,
        email:email.value
      }
      try{
      fetch('http://192.168.0.29:8080/user/insert',{
        method:"POST", headers: {'Content-Type': 'application/json'}, body:JSON.stringify(data)
      })
      .then(res=>{
        if(!res.status.toString().startsWith('2'))
        alert('입력 실패...');
      else{
        alert('입력성공');
      }
      })
      }catch(e){
        console.log(e);
      }
    }

    return {list,mylist,select,insert,name,age,password,wdate,email}
  }
}
</script>

<style lang="scss" scoped>

</style>