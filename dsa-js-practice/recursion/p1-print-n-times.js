"use strict";

function printNumbers(n) {
    return printRecursive(n, 1, []);
}

function printRecursive(n, count, output) {
    // base case
    if (n <= 0) {
        return [];
    }
    if (count > n) {
        return output;
    }
    output.push(count);
    return printRecursive(n, count + 1, output);
}

const input1 = 5;
const output1 = printNumbers(input1);
console.log("Numbers are: ", output1);

const input2 = 2;
const output2 = printNumbers(input2);
console.log("Numbers are: ", output2);

const input3 = -1;
const output3 = printNumbers(input3);
console.log("Numbers are: ", output3);
