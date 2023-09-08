"use strict";

/**
 * Print 1 to n using recursion backtracking (call to i + 1 not allowed)
 * @param {*} n 
 * @returns 
 */
function printNumberBacktrack(n) {
    printRecursiveBacktrack(n, n);
}

function printRecursiveBacktrack(n, i) {
    if (n <= 0 || i <= 0) {
        return;
    }
    printRecursiveBacktrack(n, i - 1);
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
