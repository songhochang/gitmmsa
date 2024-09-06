<template>
  <div>
    <h1>Vue웅신</h1>
    <MyAA myname="홍길동"></MyAA>
    <MyAA myname="고길동"></MyAA>
    <MyAA myname="나길동"></MyAA>
  </div>
</template>

<script>
import MyAA from '@/components/MyAA.vue'

export default {
  components:{
    MyAA
  },
  setup () {
    
    return {MyAA}
  }
}
</script>

<style lang="scss" scoped>

</style>