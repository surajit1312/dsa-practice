"use strict";

function reverseNumber(n){
    let isNumNegative = false;
    if (n == null) {
        return 0;
    }
    if (n < 0) {
        n = n * -1;
        isNumNegative = true;
    }
    let result = 0;
    while (n > 0) {
        const digit = n % 10;
        result = result * 10 + digit;
        n = Math.floor(n /10);
    }
    return isNumNegative ? result * -1 : result;
}

const input1 = 7789;
const output1 = reverseNumber(input1);
console.log("Reverse of number", input1, "is:", output1);

const input2 = -765096;
const output2 = reverseNumber(input2);
console.log("Reverse of number", input2, "is:", output2);

const input3 = null;
const output3 = reverseNumber(input3);
console.log("Reverse of number", input3, "is:", output3);
