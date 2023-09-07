"use strict";

function extractDigits(num) {
    let isNegative = false;
    if (num === null) {
        return "Invalid Input";
    }
    if (num < 0) {
        isNegative = true;
        num = Math.abs(num);
    }
    const output = [];
    while (num > 0) {
        // extracting current digit by modulo operation
        output.unshift(num % 10);
        // setting the current digit to previous index by dividing by 10 and setting it to original number
        num = Math.floor(num/10);
    }
    if (isNegative) {
        output[0] = output[0] * (-1);
    }
    return output.join(",");
}

const input1 = 7789;
const output1 = extractDigits(input1);
console.log("Extracted digits: ", output1);

const input2 = -765096;
const output2 = extractDigits(input2);
console.log("Extracted digits: ", output2);

const input3 = null;
const output3 = extractDigits(input3);
console.log("Extracted digits: ", output3);
