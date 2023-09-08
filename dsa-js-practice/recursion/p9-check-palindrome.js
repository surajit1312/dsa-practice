"use strict";

/**
 * Check if a string str is palindrome
 * Time Complexity - O(n/2)
 * Space Complexity - O(n/2)
 * @param {*} str 
 * @returns 
 */
function isPalindrome(str) {
    return checkPalindromeNumber(str, 0);
}

function checkPalindromeNumber(str, index) {
    if (index >= (str.length / 2)) {
        return true;
    }
    if (str[index] !== str[str.length - index - 1]) {
        return false;
    }
    return checkPalindromeNumber(str, index + 1);
}

console.log("=====================================================");
const input1 = "racecar";
const output1 = isPalindrome(input1);
console.log(input1, "is Palindrome:", output1);

console.log("=====================================================");
const input2 = "MALAYALAM";
const output2 = isPalindrome(input2);
console.log(input2, "is Palindrome:", output2);

console.log("=====================================================");
const input3 = "MADSM";
const output3 = isPalindrome(input3);
console.log(input3, "is Palindrome:", output3);
