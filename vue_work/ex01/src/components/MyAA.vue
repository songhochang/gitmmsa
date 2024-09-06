<template>
    <div>
        <h1>MyAA = {{ myname }}</h1>
    </div>
</template>

<script>
export default {
    props:{
        myname:{
            type: String,
            required: true
        }
    },
    setup () {
        // const name = '홍길동'
        // return {name}
        
        return{}
    }
}
</script>

<style lang="scss" scoped>

</style>