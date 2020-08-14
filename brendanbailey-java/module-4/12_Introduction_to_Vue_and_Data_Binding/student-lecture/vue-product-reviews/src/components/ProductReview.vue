<!-- HTML for the component -->
<template>
  <div class="main">
    <!-- data used in the HTML, but defined elsewhere is         -->
    <!-- coded inside a set of braces {{}} - mustache expression -->
    <h2>Product Reviews for {{productName}}</h2>
    <p class="description">{{description}}</p>
    <div class="well-display">
      <div class="well">
        <span class="amount">
          {{averageRating}}
        </span>
        Average Rating
      </div>

      <div class="well">
        <span class="amount">
          <!-- data binding goes here -->
        </span>
        1 Star Review
      </div>

      <div class="well">
        <span class="amount">
          <!-- data binding goes here -->
        </span>
        2 Star Review
      </div>

      <div class="well">
        <span class="amount">
          {{numberOfThreeStarReviews}}
        </span>
        3 Star Review
      </div>

      <div class="well">
        <span class="amount">
          <!-- data binding goes here -->
        </span>
        4 Star Review
      </div>

      <div class="well">
        <span class="amount">                                 
          <!-- data binding goes here -->
        </span>
        5 Star Review
      </div>
    </div>
    
    <!-- display each review in our array -->
    <div
        class='review'
        v-bind:class="{favorited: review.favorited}"
        v-for="review in reviews" v-bind:key="review.id"
    >
    <h4>{{ review.reviewer }}</h4>
    <div class='rating'>
        <img src='../assets/star.png' v-for='n in review.rating' v-bind:key='n'>
    </div>
    <h4>{{review.title}}</h4>
    <p>{{review.review}}</p>
    <p>Favorite?<input type='checkbox' v-model='review.favorited'/></p>
    </div>
  </div> <!-- end of the main div - a Vue component can only have one div -->
</template>

<!-- JavaScript for the component -->
<script>
/****************************************************************************************************************************************        
        export allows the sharing of JavaScript data between Vue components
        export exposes data from this component to outside processes
        default is a special export when all you have is one object to share
*****************************************************************************************************************************************/
export default {
  
  // A JavaScript object to share with other components
  name: "product-review", // name of the component this export belongs to
  
  // note the name: lower-case with a '-' between words
  // Vue component filename is ProductReview
  // the component name is the filename in lowercase with a '-' between words
  
  data() {  // the data() function is called by Vue when data is requested by the component
    
    return {
      productName: "Cigar Parties for Dummies", // return this object to Vue when it asks for data
      description:
        "Host and plan the perfect cigar party for your squirell friends",
      reviews: [
        // Data to be displayed by our component on the page
        {
          reviewer: "Malcolm Gladwell",
          title: "What a book!",
          review:
            "It certainly is a book. I mean, I can see that. Pages kept together with glue and there's writing on it, in some language.",
          rating: 3,
          favorite: false
        },
        {
          reviewer: "Craig Castelaz",
          title: "Better than a swift kick in the butt!",
          review: "My bar is low.",
          rating: 4,
          favorite: false
        }
      ]
    }; // end of return
  }, // end of data function
    computed: {
        averageRating() {
            let sum = this.reviews.reduce((currentSum, aReview) => {
                return currentSum + aReview.rating    
            },0);
            return sum/this.reviews.length;
        },
        numberOfThreeStarReviews() {
            return this.reviews.reduce((currentCount, aReview) => {
                if (aReview.rating === 3) {
                    currentCount++
                }
                return currentCount
            },0);
        }
    } // end of computed
}; // end of export
</script>

<!-- CSS -->
<style scoped>
/* Scoped says only apply this CSS to this component */
/* without scoped the CSS would be applied to the entire page */
div.main {
  margin: 1rem 0;
}

div.main div.well-display {
  display: flex;
  justify-content: space-around;
}

div.main div.well-display div.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
}

div.main div.review.favorited {
background-color: lightyellow;
}

div.main div.well-display div.well span.amount {
  color: darkslategray;
  display: block;
  font-size: 2.5rem;
}

div.main div.review {
  border: 1px black solid;
  border-radius: 6px;
  padding: 1rem;
  margin: 10px;
}

div.main div.review div.rating {
  height: 2rem;
  display: inline-block;
  vertical-align: top;
  margin: 0 0.5rem;
}

div.main div.review div.rating img {
  height: 100%;
}

div.main div.review p {
  margin: 20px;
}

div.main div.review h3 {
  display: inline-block;
}

div.main div.review h4 {
  font-size: 1rem;
}
</style>