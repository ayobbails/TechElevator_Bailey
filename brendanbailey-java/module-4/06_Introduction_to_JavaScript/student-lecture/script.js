/*
    Example of a multi-line comment just like in C#/Java
*/

// Single line comment

/**
 * Functions start with the word function.
 * They DO NOT have a return type and the naming convention is camelCase.
 * no return type because JavaScript variables are dynamic/loosely typed.
 * CONCEPT OF FUNCTIONS INTRODUCED TODAY - MORE TOMORROW (JavaScript DAY 2).
 */
function variables() {
  // Declares a variable where the value cannot be changed
  // Declares a variable those value can be changed
  // Use let statement to declare a variable in JavaScript
  // DO NOT USE var TO DEFINE A VARIABLE - not considered good practice
  // Declares a variable that will always be an array
  // const attribute makes a variable who's value cannot be changed
  const daysPerWeek = 7;
  console.log(`There are ${daysPerWeek} in a week.`);

  // Declare variable who's name can be changed
  let daysPerMonth = 30;   // int assigned to variable
  console.log (`There are ${daysPerMonth} in a month`);
  daysPerMonth = 'Thirty'; // assign string to a variable
  console.log (`There are ${daysPerMonth} in a month`);

  // Strings are enclosed in single or double quotes
  // ; is usually optional at the end of the statement

  // Declares a variable that will always be an array
  // Arrays are enclosed in []
  // You may declare values in an Array when defined or not

  let weekdays = [
                  'Monday',
                  'Tuesday',
                  'Wednesday',
                  'Thursday',
                  'Friday',
                  'Saturday',
                  'Sunday'
  ]
  console.table(weekdays); // Display array as a table
}


/**
 * Functions can also accept parameters.
 * Notice the parameters do not have types.
 * @param {Number} param1 The first number to display
 * @param {Number} param2 The second number to display
 */
function printParameters(param1, param2) {
  console.log(`The value of param1 is ${param1}`);
  console.log(`The value of param2 is ${param2}`);
}

/**
 * Compares two values x and y.
 * == is loose equality   - values are the same - does not account for data type
 * === is strict equality - values and data types are the same
 * @param {Object} x
 * @param {Object} y
 */
function equality(x, y) {
  console.log(`x is ${typeof x}`);  // typeof - returns the data type of a variable
  console.log(`y is ${typeof y}`);

  console.log(`x == y : ${x == y}`);    // true
  console.log(`x === y : ${x === y}`);  // false
}

/**
 * Each value is inherently truthy or falsy.
 * false, 0, '', null, undefined, and NaN are always falsy
 * everything else is always truthy
 * @param {Object} x The object to check for truthy or falsy,
 */
function falsy(x) {
  if (x) { // EVERYTHING is truthy or falsy
    console.log(`${x} is truthy`);
  } else {
    console.log(`${x} is falsy`);
  }
}

/**
    Objects in JavaScript are NOT the same as Objects in Java/C#
    Objects in JavaScript are NOT Object Oriented Objects  
  
    Objects are simple key-value pairs (like a map)
    - values can be primitive data types
    - values can be arrays
    - or they can be functions
    JSON - JavaScript Object Notation
*/
function objects() {
  const person = {        // Object attributes are defined inside {}
    firstName: "Bill",    // key : value
    lastName: "Lumbergh", // place commas between attributes of the object
    age: 42,
    employees: [          // An object attribute can be an array
      "Peter Gibbons",
      "Milton Waddams",
      "Samir Nagheenanajar",
      "Michael Bolton"
    ],
    toString : function() { // add an attribute to the object that is a function
      return `${this.lastName}, ${this.firstName}, ${this.age}`   // this means the current object
    }
  };

  // Log the object
  console.log(`person object is ${person}`)   // Uses the toString() for objects
  console.table(person)
  console.log(person.toString());
  
  // Log the first and last name
  // reference an attribute in an object --> object-name.attribute --> notation
  console.log(`First Name: ${person.firstName} Last Name: ${person.lastName}`)
  
  // Log each employee
  // employees is an array in the object
  // we need to loop through the array
  // Use a JavaScript for loop --> same format as Java for loop
    // let instead of "int"
  for (let i = 0; i < person.employees.length; i++) {           // loop through the person objects employees array
    console.log(`Employee #: ${i+1} is ${person.employees[i]}`) // Display employee array position 1-based value
                                                                // and the date in the employee element of the array
  }

}

/*
########################
Function Overloading
########################

Function Overloading is not available in Javascript. If you declare a
function with the same name, more than one time in a script file, the
earlier ones are overriden and the most recent one will be used.
*/

function Add(num1, num2) {
  return num1 + num2;
}

function Add(num1, num2, num3) {
  return num1 + num2 + num3;
}

/*
########################
Math Library
########################

A built-in `Math` object has properties and methods for mathematical constants and functions.
*/

function mathFunctions() {
  console.log("Math.PI : " + Math.PI);
  console.log("Math.LOG10E : " + Math.LOG10E);
  console.log("Math.abs(-10) : " + Math.abs(-10));
  console.log("Math.floor(1.99) : " + Math.floor(1.99));
  console.log("Math.ceil(1.01) : " + Math.ceil(1.01));
  console.log("Math.random() : " + Math.random());
}

/*
########################
String Methods
########################

The string data type has a lot of properties and methods similar to strings in Java/C#
*/

function stringFunctions(value) {
  console.log(`.length -  ${value.length}`);
  console.log(`.endsWith('World') - ${value.endsWith("World")}`);
  console.log(`.startsWith('Hello') - ${value.startsWith("Hello")}`);
  console.log(`.indexOf('Hello') - ${value.indexOf("Hello")}`);

  /*
    Other Methods
        - split(string)
        - substr(number, number)
        - substring(number, number)
        - toLowerCase()
        - trim()
        - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String
    */
}
