<!-- Implement a `MyBooks` view that displays the `ReadingList` component -->
<!-- Make this view appear when the path is `/myBooks`                    -->

<template>
<div>
  <reading-list />
  <router-link v-bind:to="{name: 'newBook'}">Add Book to Reading List</router-link>
</div>    
</template>

<script>
import ReadingList from '@/components/ReadingList.vue';
export default {
    components: {
       ReadingList 
    }
}
</script>
<style>
</style>