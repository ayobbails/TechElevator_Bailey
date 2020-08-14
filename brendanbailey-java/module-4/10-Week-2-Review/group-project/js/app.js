// Identify and define global variables (used by multiple functions) at the top of the program

const PROBLEMS_PER_SET = 10; /* number of problems in a set 
                                change this to change the number of problems presented to the user */
let score = 0;               // the number of correct answers so far
let currentProblem = 1;      // The problem the user has currently displayed
let problemSet = [];         // set of problems being presented to the user

// Generate an array PROBLEM_PER_SET random problems (flexible enough to change in the future)
// A problem contains: left operand, right operand, operator, 4 answers
// create an object to have multiple values

for (let i = 0; i < PROBLEMS_PER_SET; i++) {
 // Define and initialize a problem object 
    const problem = {
        left:    getRandomNumber(10), // Set the left operand to 0 through 9
        operator:'*',
        right:   getRandomNumber(10), // Set the right operand to 0 through 9
        answer:  null                 // We don't know the answer yet due to random operands
    }
    // Calculate the correct answer and store it in the problem
    const correctAnswer = problem.left * problem.right; // Calculate correct answer
    problem.answer = correctAnswer;

    // Create a shuffled array containing the correct answer and 3 random answers
    let answerSet = shuffleArray([correctAnswer, getRandomNumber(82),getRandomNumber(82),getRandomNumber(82)]);

    // Add the problem and answerSet to the problemSet
    problemSet.push({problem, answerSet});
}
// console.table(problemSet);

// Display a problem on the page - called from multiple places (page load, next problem)

function displayProblem() {
// Add the problem to the DOM
    const problemElement = document.getElementById('problem');
// currentProblem starts at 1 (to count the problems like a human) - so we do -1 to get to the index
    const theProblemExpressions = `${problemSet[currentProblem-1].problem.left} ${problemSet[currentProblem-1].problem.operator} ${problemSet[currentProblem-1].problem.right}`;
    problemElement.querySelector('div').innerText = theProblemExpressions;
}
// Display the first problem when the page loads
document.addEventListener('DOMContentLoaded', () => {
    displayProblem();
});
// Display the answer choices in the page

// Create an array of four answers - only one is correct
// Limit the multipliers in the problem to value
                // Incorrect answers must be between 0 and 81
// Display the next problem when the button is clicked
// Generate a new set of answer choices when the button is clicked
// Keep track of the score (# of correct answers)
// Advance the problem number   
// When the last question is answered, hide elements not included in the summary screen
// Reset the score to 0 if they start over
// Reset the current problem if they start over
// Generate a new problem if they start over

// Create a utility function to generate random operands 
    // console.log(getRandomNumber(82));
    // console.log(getRandomNumber(82));
    // console.log(getRandomNumber(82));
    // console.log(getRandomNumber(82));
    // console.log(getRandomNumber(82));
    // console.log(getRandomNumber(82));
// Create a utility function to shuffle the array of answers using array sort function

//  let nums = [10, 3, 67, 32];
//  console.table(nums);
//  let newNums = shuffleArray(nums);
//  console.table(newNums);

// Deal with the "happy path" first, then the edge cases

/**********************************************************************
 * Utility function to generate a random number based on max
 * @param {number} max - the highest value to generate + 1
 *                       if you want a value between 0 and 9  max = 10
 *                       if you want a value between 0 and 21 max = 22
 *                       if you want a value between 0 and 81 max = 81
 **********************************************************************/

function getRandomNumber(max) {
        // Math.random() generates a value between 0 and 1
    return Math.floor(Math.random() * Math.floor(max));  
}

/**********************************************************************
 * Utility function to shuffle the items in an array
 * @param {object} arr
 **********************************************************************/

function shuffleArray(arr) {
    // Use a compare() function to tell sort how two elements compare
    // Two elements are passed to the function by sort
    // The function returns a value indicating the relationship of the first element to the second
    //      if the first element is LESS than the second    - returns a NEGATIVE value
    //      if the first element is EQUAL to the second     - returns a ZERO
    //      if the first element is GREATER than the second - returns a POSITIVE value
    // Sort calls this function until the function indicates all the elements are in ascending order
    // Use a calculation with a random number in the return of the function to randomize the array
    return arr.sort(function (a, b) {
         return Math.random() - 0.5 
    })
}