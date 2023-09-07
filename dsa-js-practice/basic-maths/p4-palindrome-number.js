"use strict";

function checkPalindromeNumber(n){
    let result = 0;
    const original = n;
    while (n > 0) {
        const ld = n % 10;
        result = result * 10 + ld;
        n = Math.floor(n /10);
    }
    return result === original;
}

const input1 = 7789;
const output1 = checkPalindromeNumber(input1);
console.log("Number", input1, "is palindrome:", output1);

const input2 = 78087;
const output2 = checkPalindromeNumber(input2);
console.log("Number", input2, "is palindrome:", output2);

const input3 = null;
const output3 = checkPalindromeNumber(input3);
console.log("Number", input3, "is palindrome:", output3);
