"use strict";

/**
 * Print sum of 1st n natural numbers
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 * @param {*} n 
 * @returns 
 */
function sumNaturalNumbers(n) {
    let sum = 0;
    sumRecursiveUsingParams(n, sum);
    const sumOfN = sumNum(n);
    console.log("(Using recursive function) Sum of " + n + " natural numbers is :", sumOfN);
}

/**
 * Finding sum using recursion parameters
 * @param {*} n 
 * @param {*} sum 
 * @returns 
 */
function sumRecursiveUsingParams(n, sum) {
    if (n < 0) {
        return;
    }
    if (n === 0) {
        console.log("Sum of " + n + " natural numbers is :", sum);
        return;
    }
    sum += n;
    sumRecursiveUsingParams(n - 1, sum);
}

/**
 * Finding sum using recursive function calls
 * @param {*} n 
 * @param {*} sum 
 * @returns 
 */
function sumNum(n) {
    if (n < 1) {
        return 0;
    }
    return n + sumNum(n - 1);
}

console.log("================");
const input1 = 5;
sumNaturalNumbers(input1);

console.log("================");
const input2 = 10;
sumNaturalNumbers(input2);

console.log("================");
const input3 = -2;
sumNaturalNumbers(input3);
