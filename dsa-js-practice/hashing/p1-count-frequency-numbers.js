"use strict";

/**
 * Time Complexity: O(log(min(n1, n2))) to base Φ (phi)
 * @param {*} n 
 * @returns 
 */
function countFrequency(n, x, nums) {
    const map = new Array(x + 1).fill(0);
    const result = [];
    // pre-storing
    for (let i = 0; i < nums.length; i++) {
        map[nums[i]]++;
    }
    console.log(map);
    // fetching
    for (let i = 1; i <= n; i++) {
        result.push(map[i]);
    }
    return result;
}

const nums = [1, 3, 1, 9, 2, 7];
const n = 6, x = 9;
const output1 = countFrequency(n, x, nums);
console.log(output1);
