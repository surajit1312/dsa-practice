"use strict";

/**
 * Print n to 1 using recursion backtracking (call to i - 1 not allowed)
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 * @param {*} n 
 * @returns 
 */
function printNumberBacktrack(n) {
    printRecursiveBacktrack(n, 1);
}

function printRecursiveBacktrack(n, i) {
    if (n <= 0 || i > n) {
        return;
    }
    printRecursiveBacktrack(n, i + 1);
    console.log(i);
}

console.log("================");
const input1 = 5;
printNumberBacktrack(input1);

console.log("================");
const input2 = 10;
printNumberBacktrack(input2);

console.log("================");
const input3 = -2;
printNumberBacktrack(input3);
