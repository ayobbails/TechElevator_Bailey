const name = 'Cigar Parties for Dummies';
const description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
const reviews = [
  {
    reviewer: 'Malcolm Gladwell',
    title: 'What a book!',
    review:
      "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
    rating: 3
  },
  {
    reviewer: 'Tim Ferriss',
    title: 'Had a cigar party started in less than 4 hours.',
    review:
      "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
    rating: 4
  },
  {
    reviewer: 'Ramit Sethi',
    title: 'What every new entrepreneurs needs. A door stop.',
    review:
      "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
    rating: 1
  },
  {
    reviewer: 'Gary Vaynerchuk',
    title: 'And I thought I could write',
    review:
      "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
    rating: 3
  }
];

/**
 * Add our product name to the page title
 * Get our page page title by the id and the query the .name selector
 * once you have the element you can add the product name to the span.
 */
function setPageTitle() {
               // get a reference to the id='page-title' in the DOM
  const pageTitle = document.getElementById('page-title');
                                         //  page-title now points to the element in the DOM with the id='page-title'
  // go to element referenced by page title                                       
     pageTitle.querySelector('.name')      .innerText =               name;
           //  find the 'class=name' and set its text to our variable name                                      
}

/**
 * Add our product description to the page.
 */
function setPageDescription() {
  // Get a reference to the element with class='description'
                       document.querySelector('.description').innerText =      description;
  //---------------------------------------------->// set its innerText to OUR description --> Host and plan the perfect cigar 
                                                                                             //party for all your squirrelly friends.
}

/*
 * I will display all of the reviews on the page.
 * I will loop over the array of reviews and use some helper functions
 * to create the elements needed for our markup and add them to the DOM
 */
function displayReviews() {
            // get a reference to  id = main
  const main = document.getElementById('main');
  
  // Loop through the array of review objects and add them to the DOM (so the user can see them)
  //      Loop through the array called reviews with each element named aReview in the loop
  reviews.forEach((addReview) => {
  //                           create a ----> div to hold the new review to be added to the DOM  
    const newReview = document.createElement('div');
  //          adding a     "class =   review" attribute to the div  
    newReview.setAttribute('class',  'review')
  //                        attribute value
  
  // run the functions to add the additional info to the reviews
                    
    addReviewer(newReview, aReview.reviewer);// call addReviewer() with the parent and the data 
    addRating(newReview, addReview.rating);
    addTitle();
    addReview();
  
  // At this point we have a new div (element) with what we want in it, but it has not been added to the DOM
  
  // Add new element to the DOM as a child of the element with the id='main' as indicated in the html
  // Add the newReview to the end of the element with the id main
  main.insertAdjacentElement('beforeend', newReview);
  })
}




/**
 * I will creating a new h4 element with the name of the reviewer and append it to
 * the parent element that is passed to me.
 *
 * @param {HTMLElement} el: The element to append the reviewer to
 * @param {string} name The name of the reviewer
 */
function addReviewer(parent, name) {
                        
  const reviewer = document.createElement('div');// create a div to hold the reviewer's name                 
  reviewer.innerText = name;// set the content of the div to the name passed in as second argument                 
  parent.appendChild(reviewer)// add the div as a child of the parent passed in as first parameter
}

/**
 * I will add the rating div along with a star image for the number of ratings 1-5
 * @param {HTMLElement} parent
 * @param {Number} numberOfStars
 */
function addRating(parent, numberOfStars) {
  const rating = document.createElement('div');
  rating.setAttribute('class','rating');
  for (let i = 0; i < numberOfStars; i++) {
    const star = document.createElement('img');
    star.src('img/star.png');
    star.setAttribute('class','')
  }
}

/**
 * I will add an h3 element along with the review title
 * @param {HTMLElement} parent
 * @param {string} title
 */
function addTitle(parent, title) {}

/**
 * I will add the product review
 * @param {HTMLElement} parent
 * @param {string} review
 */
function addReview(parent, review) {}

// set the product reviews page title
setPageTitle();

// set the product reviews page description
setPageDescription();

// display all of the product reviews on our page
displayReviews();
