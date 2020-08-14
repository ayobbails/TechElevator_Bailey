<template>
    <book-details v-bind:book='viewedBook' />
</template>

<script>
import BookDetails from '@/components/BookDetails.vue';

export default {
    components: {
        BookDetails
    },
    computed: {
        viewedBook() {
            let thisBook = this.$store.state.books.filter((book) => {
                return book.isbn == this.$route.params.id;
            });
            if (thisBook.length > 0) {
                return thisBook[0];
            } else {
                return {
                    title: '',
                    author: '',
                    read: false,
                    isbn: ''
                };
            }
        }
    }
}
</script>

<style>
</style>