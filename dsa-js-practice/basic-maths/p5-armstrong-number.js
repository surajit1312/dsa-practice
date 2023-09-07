"use strict";

function checkArmstrongNumber(n) {
    const original = n;
    let sum = 0;
    const power = countDigits(n);
    while (n > 0) {
        const ld = n % 10;
        sum += Math.pow(ld, power);
        n = Math.floor(n / 10);
    }
    return sum === original;
}

function countDigits(n) {
    let count = 0;
    while (n > 0) {
        n = Math.floor(n / 10);
        count++;
    }
    return count;
}

const input1 = 371;
const output1 = checkArmstrongNumber(input1);
console.log("Number", input1, "is an Armstrong number:", output1);

const input2 = 1634;
const output2 = checkArmstrongNumber(input2);
console.log("Number", input2, "is an Armstrong number:", output2);

const input3 = 134;
const output3 = checkArmstrongNumber(input3);
console.log("Number", input3, "is an Armstrong number:", output3);
