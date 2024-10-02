<template>
    <div>
<h1 class="text-5xl">SELECT</h1>
<label for="email">email</label>
<input type="text" name="" id="email" v-model="email" class="border border-gray-300 rounded-md py-2 px-4 focus:outline-none focus:ring-2 focus:ring-blue-500">
<h1 class="text-3xl">{{ email }}</h1>
<button @click="doInsert" class="bg-blue-500 text-white font-bold py-2 px-4 rounded hover:bg-blue-700">INSERT</button>
    </div>
</template>

<script>
import {ref} from "vue";
export default {
    setup () {
        const email = ref('');
        const doInsert = ()=>{
            // console.log(email.value);
            // fetch(`http:localhost:8080/user/insert`,).then()
        }

        return {email, doInsert}
    }
}
</script>

<style lang="scss" scoped>

</style>