<template>
  <div>
    <h1>My Kanban Boards</h1>
    <div class="boards">
      <div class="loading" v-if="isLoading">          <!-- if page is being loaded                   -->
        <img src="../assets/ping_pong_loader.gif" />  <!-- include this image as a loading indicator -->
      </div>
      <div
        class="board"
        v-for="board in boards"
        v-bind:key="board.id"
        v-bind:style="{ 'background-color': board.backgroundColor }"
        v-else
      >
        <!-- router-link sets up a link to router view -->
        <router-link :to="{ name: 'Board', params: { id: board.id } }">
          {{ board.title }}
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
import boardsService from '../services/BoardService';

export default {
  data() {
    return {
      boards: [],
      isLoading: true // indicate whether the page is in the process of being loaded
    };
  },
  created() { // When this component begins processing and before its displayed 
    // `.then` after an API call is how you wait for the promise to be fullfilled
    //  specify what you want to do when the API call is done with a function on the `.then`
    
                        //   .then() returns a promise
    boardsService.getBoards().then(response => {  // Call the service to load the data - service is doing an API call
      this.boards = response.data;                //  copy the data from the HTTP response to our variable
      this.isLoading = false;                     //  indicate the page is no longer being loaded
    });
  }
};
</script>

<style scoped>
.boards {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.board {
  background-color: #f7fafc;
  border-radius: 10px;
  padding: 40px;
  flex: 1;
  margin: 0 20px;
  text-align: center;
}
.loading {
  flex: 3;
}
.board a:link,
.board a:visited {
  color: rgb(243, 243, 243);
  text-decoration: none;
}
</style>
