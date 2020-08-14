<template>
  <div class="card">
    <!-- put the h3 with book title -->
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <!-- put the h3 with the author here                                                               -->
    <!-- add a button to mark it read/unread                                                           -->
    <!-- that needs to say read/unread depending on the current read status                            -->
    <!-- if current status is read, the button should be marked unread                                 -->
    <!-- if current status is not read, the button should be marked read                               -->
    <!-- if the book status is read, it needs class read added to the div                              -->
    <!-- because book properties are in the Vuex Data Store, we need a mutation to set the read status -->
  </div>
</template>

<script>
export default {
    name: 'book-card',
    props: {                // data whose values come from outside this component
            book : Object   // we are going to get an object called book

    }            
}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>