"use strict";

function countDigits(n){
    if (n == null) {
        return 0;
    }
    if (n < 0) {
        n = Math.abs(n);
    }
    let count = 0;
    while (n > 0) {
        n = Math.floor(n / 10);
        count++;
    }
    return count;
}

/**
 * Very IMP Tip
 * @param {*} n 
 * @returns 
 */
function countDigitsBest(n){
    if (n == null) {
        return 0;
    }
    if (n < 0) {
        n = Math.abs(n);
    }
    return Math.floor(Math.log10(n)) + 1;
}

const input1 = 7789;
const output1 = countDigits(input1);
console.log("Count of digits: ", output1);

const input2 = -765096;
const output2 = countDigits(input2);
console.log("Count of digits: ", output2);

const input3 = null;
const output3 = countDigits(input3);
console.log("Count of digits: ", output3);

const input4 = 7789789;
const output4 = countDigitsBest(input4);
console.log("Count of digits: ", output4);
