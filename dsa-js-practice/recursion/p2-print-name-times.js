"use strict";

/**
 * Print name n times
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 * @param {*} name 
 * @param {*} n 
 * @returns 
 */
function printName(name, n) {
    return printRecursive(name, n, 1);
}

function printRecursive(name, n, count) {
    // base case
    if (n < 0 || count > n) {
        return;
    }
    console.log(name);
    return printRecursive(name, n, count + 1);
}

const input1 = "Coding Ninjas";
const output1 = printName(input1, 5);

const input2 = "Hello";
const output2 = printName(input2, 10);

const input3 = "Zero";
const output3 = printName(input3, -1);
