"use strict";

/**
 * Time Complexity: O(sqrt(n) + nlog(n)) 
 * @param {*} n 
 * @returns 
 */
function divisorsOfNumber(n) {
    const divisors = [];
    // O(sqrt(n))
    for (let i = 1; i < Math.floor(Math.sqrt(n)); i++) {
        if (n % i === 0) {
            divisors.push(i);
            if ((n / i) !== i) {
                divisors.push(n/i);
            }
        }
    }
    // O(nlog(n))
    divisors.sort(function(a, b) {
        return a > b ? 1 : -1;
    })
    return divisors;
}

const input1 = 36;
const output1 = divisorsOfNumber(input1);
console.log("Divisors of number", input1, "are:", output1);

const input2 = 1634;
const output2 = divisorsOfNumber(input2);
console.log("Divisors of number", input2, "are:", output2);

const input3 = 134;
const output3 = divisorsOfNumber(input3);
console.log("Divisors of number", input3, "are:", output3);
