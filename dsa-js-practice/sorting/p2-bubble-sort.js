"use strict";

/**
 * Time Complexity: Worst, Average case: O(n^2), Best case: When array is sorted: O(n)
 * 
 * Sort an array with bubble sort
 * https://www.codingninjas.com/studio/problems/bubble-sort_624380
 * 
 * @param {*} n 
 * @returns 
 */
function bubbleSort(arr) {
    // loop is the step which would start from 0 to (n - 2)th term
    const n = arr.length;
    for (let i = n - 1; i >= 1; i--) {
        let hasSwapped = false;
        for (let j = 0; j <= i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                let temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
                hasSwapped = true;
            }
        }
        if (!hasSwapped) {
            break;
        }
    }
    return arr;
}

const input1 = [2, 13, 4, 1, 3, 6, 28];
const output1 = bubbleSort(input1);
console.log("Bubble sort output: ", output1);
