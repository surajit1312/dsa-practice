"use strict";

/**
 * Time Complexity: O(n^2)
 * 
 * Sort an array with selection sort
 * https://www.codingninjas.com/studio/problems/selection-sort_624469
 * 
 * @param {*} n 
 * @returns 
 */
function selectionSort(arr) {
    // loop is the step which would start from 0 to (n - 2)th term
    for (let i = 0; i <= arr.length - 2; i++) {
        let min = i;
        for (let j = i + 1; j <= arr.length - 1; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        // swap(arr[i], arr[min]);
        let temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp; 
    }
    return arr;
}

const input1 = [8, 6, 2, 5, 1];
const output1 = selectionSort(input1);
console.log("Selection sort output: ", output1);
