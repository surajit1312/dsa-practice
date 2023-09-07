"use strict";

/**
 * Time Complexity: O(sqrt(n))
 * @param {*} n 
 * @returns 
 */
function isPrimeNumber(n) {
    let count = 0;
    for (let i = 1; i < Math.floor(Math.sqrt(n)); i++) {
        if (n % i === 0) {
            count++;
            if (i !== (n / i)) {
                count++;
            }
        }
    }
    return count == 2;
}

const input1 = 11;
const output1 = isPrimeNumber(input1);
console.log("Is number", input1, "prime:", output1);

const input2 = 94;
const output2 = isPrimeNumber(input2);
console.log("Is number", input2, "prime:", output2);

const input3 = 3449;
const output3 = isPrimeNumber(input3);
console.log("Is number", input3, "prime:", output3);
