"use strict";

/**
 * Generate fibonacci number
 * Time Complexity - O(n/2)
 * Space Complexity - O(n/2)
 * @param {*} str 
 * @returns 
 */
function generateFibonacciNumbers(n) {
    const arr = Array(n);
    for (let i = n - 1; i >= 0; i--) {
        arr[i] = fibonacci(i);
    }
    return arr;
}

function fibonacci(n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}

console.log("=====================================================");
const input1 = 5;
const output1 = generateFibonacciNumbers(input1);
console.log("Fibonacci till", input1, "th term:", output1);

console.log("=====================================================");
const input2 = 3;
const output2 = generateFibonacciNumbers(input2);
console.log("Fibonacci till", input2, "th term:", output2);

console.log("=====================================================");
const input3 = 2;
const output3 = generateFibonacciNumbers(input3);
console.log("Fibonacci till", input3, "th term:", output3);
