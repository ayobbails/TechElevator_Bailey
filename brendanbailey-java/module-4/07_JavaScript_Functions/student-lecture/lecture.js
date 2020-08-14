/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 * 
 * @returns {number} 1
 */
function returnOne() {
  return 1;
}

/**
 * Functions can also take parameters. These are just variables that are filled
 * in by whoever is calling the function.
 *
 * Function parameters are always optional in JavaScript NOT in Java
 * 
 * Also, we don't *have* to return anything from the actual function.
 *
 * @param {any} value the value to print to the console
 */
function printToConsole(value) {
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. 
 * But what happens if we don't pass a value in?  - It will return NaN (Not a Number)
 * What happens if the value is not a number?     - no problem as long as it represents a number "1"
 *                                                - NaN if either value does not represent a numeric value "Pony"
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */

/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=0] the second parameter to multiply
 */

 function multiplyNoUndefined(firstParameter=0, secondParameter=0) {
   return firstParameter * secondParameter;
 }

 
/**
 * Functions can return earlier before the end of the function. This could be useful
 * in circumstances where you may not need to perform additional instructions or have to
 * handle a particular situation.
 * In this example, if the firstParameter is equal to 0, we return secondParameter times 2.
 * Observe what's printed to the console in both situations.
 * 
 * @param {number} firstParameter the first parameter
 * @param {number} secondParameter the second parameter
 */
function returnBeforeEnd(firstParameter, secondParameter) {
  console.log("This will always fire.");

  if (firstParameter == 0) {
    console.log("Returning secondParameter times two.");
    return secondParameter * 2;
  }

  //this only runs if firstParameter is NOT 0
  console.log("Returning firstParameter + secondParameter.");
  return firstParameter + secondParameter;
}

/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 */
function scopeTest() {
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block
    let scopedToBlock = inScopeInScopeTest;
  }

  // scopedToBlock doesn't exist here so an error will be thrown
  if (inScopeInScopeTest && scopedToBlock) {
    console.log("This won't print!");
  }
}
                            //             default empty array for listOfQuirks   separator is ','
function createSentenceFromUser(name, age, listOfQuirks = [],                     separator = ', ') {
  // Construct a string containing the person's basic info from the parameters
  let description = `${name} is currently ${age} years old. Their quirks are: `;
  
                                //  .join() method will take the elements in an array and construct a string with elements
                                //    separated by the separator 
  return description + listOfQuirks.join(separator);
}

/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {

  //  array.reduce() - generate a single value from all the elements in the array
  //                   there is an implied forEach loop to process the array 
  //                   the function given is called for each element in the array
  //
  //  array.reduce(function-to-generate-the-final-result)
  //
  //  the function given accepts two parameters (variable-for-result, name-for-the-current-element)
  
  return numbersToSum.reduce((sum,  number)               => {
                        //  ^ start reduce method call       ^ start anonymous function
                      
                        return  sum + number; }                           );
                                        //  ^ ends anonymous function   ^ ends the reduce method call
/*
      Given: numbersToSum - [1, 2, 3]

      numbersToSum.reduce((sum, number) => {return sum + number});

      1. Call the anon-function with   sum=0, number=1
      2. The anon-function will return sum + number and store that value in sum
      
      3. Call the anon-function with   sum=1, number=2
      4. The anon-function will return sum + number and store that value in sum
      
      5. Call the anon-function with   sum=3, number=3
      6. The anon-function will return sum +  number and store that value in sum
      
      7. The result of numbersToSum.reduce is the value in sum
  */
}

/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */
function allDivisibleByThree(numbersToFilter) {
  // Go through the array numbersToFilter one element at a time passing the element to anon-function 
  //  if the anon-function returns true the element will be added to a new array
  //  if false, it wont.
  return numbersToFilter.filter((number)=> {
                                            if (number % 3 == 0) return true ;
                                            else                 return false;
                                            })
}
