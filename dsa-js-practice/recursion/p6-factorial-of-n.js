"use strict";

/**
 * Print factorial of a number using recursive functon calls
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 * @param {*} n 
 * @returns 
 */
function factorial(n) {
    if (n < 0) {
        return "Invalid input";
    }
    if (n === 0) {
        return 1;
    }
    return n * factorial(n - 1);
}

console.log("==================================");
const input1 = 5;
const output1 = factorial(input1);
console.log("Factorial of", input1, ":", output1);

console.log("==================================");
const input2 = 10;
const output2 = factorial(input2);
console.log("Factorial of", input2, ":", output2);

console.log("==================================");
const input3 = -2;
const output3 = factorial(input3);
console.log("Factorial of", input3, ":", output3);
