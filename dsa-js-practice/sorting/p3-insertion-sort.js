"use strict";

/**
 * Time Complexity: Worst, Average case: O(n^2), Best case: When array is sorted: O(n)
 * 
 * Sort an array with insertion sort
 * https://www.codingninjas.com/studio/problems/insertion-sort_3155179
 * 
 * @param {*} n 
 * @returns 
 */
function insertionSort(arr) {
    const n = arr.length;
    for (let i = 0; i <= n - 1; i++) {
        let j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            let temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
        }
    }
    return arr;
}

const input1 = [2, 13, 4, 1, 3, 6, 28];
const output1 = insertionSort(input1);
console.log("Insertion sort output 1: ", output1);

const input2 = [1, 3, 5, 7, 9];
const output2 = insertionSort(input2);
console.log("Insertion sort output 2: ", output2);

