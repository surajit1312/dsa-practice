"use strict";

/**
 * Time Complexity: O(log(min(n1, n2))) to base Φ (phi)
 * @param {*} n 
 * @returns 
 */
function gcdOfNumber(num1, num2) {
    while (num1 > 0 && num2 > 0) {
        if (num1 > num2) {
            num1 = num1 % num2;
        } else {
            num2 = num2 % num1;
        }
    }
    if (num1 == 0) {
        return num2;
    } else {
        return num1;
    }
}

const a = 11, b = 13;
const output1 = gcdOfNumber(a, b);
console.log("GCD of", a, " and ", b, " is:", output1);

const x = 20, y = 40;
const output2 = gcdOfNumber(x, y);
console.log("GCD of", x, " and ", y, " is:", output2);
