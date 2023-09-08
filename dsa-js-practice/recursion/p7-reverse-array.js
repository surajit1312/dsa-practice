"use strict";

/**
 * Reverse an array of numbers recursive functon calls
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 * @param {*} n 
 * @param {*} nums
 * @returns 
 */
function reverseArray(n, nums) {
    return reverse(nums, 0, n - 1)
}

function swap(arr, a, b) {
    let temp = arr[b];
    arr[b] = arr[a];
    arr[a] = temp;
    return arr;
}

function reverse(arr, left, right) {
    if (left >= right) {
        return arr;
    }
    arr = swap(arr, left, right);
    return reverse(arr, left + 1, right - 1);
}

console.log("=====================================================");
const input1 = [5, 7, 8, 1, 6, 3];
const output1 = reverseArray(6, input1);
console.log("Reverse of array is:", output1);

console.log("=====================================================");
const input2 = [0, 9, -5, 7, 3];
const output2 = reverseArray(5, input2);
console.log("Reverse of array is:", output2);
