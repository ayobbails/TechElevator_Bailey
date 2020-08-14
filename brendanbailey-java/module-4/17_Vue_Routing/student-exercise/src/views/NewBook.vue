<template>
<!-- Implement a `NewBook` view                                       -->
<!-- that displays the `NewBookForm` component at the path `/addBook` -->  
<new-book-form />  
</template>

<script>
import NewBookForm from '@/components/NewBookForm.vue';
export default {
    components: {
        NewBookForm
    }
}
</script>
<style>

</style>