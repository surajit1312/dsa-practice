function getRevArray(a, targetIndex, power) {
    if (a === null || a.length === 0) {
        return [];
    }
    if (targetIndex === a.length) {
        return;
    }
    let temp = a[targetIndex];
    let offset = a.length % 2 === 0 ? (2 * power)- 1 : (2 * power);
    a[targetIndex] = a[targetIndex - offset];
    a[targetIndex - offset] = temp;
    getRevArray(a, targetIndex + 1, power + 1);
    return a;
}

/*
 * Complete the 'reverseArray' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

function reverseArray(a) {
    // Write your code here
    const targetIndex = a.length % 2 === 0 ? Math.floor(a.length / 2) : Math.floor(a.length / 2) + 1;
    return getRevArray(a, targetIndex, 1);
}

let arr = [1, 2, 3, 6, 8, 10, 11, 14];      // t=4, o=1, t=5, o=3, t=6, o=5 -> offset = 2 * r - 1 
         // [1, 2, 3, 6, 8, 10, 11, 14, 19]   // t=5, o=t-2, t=6, o=t-4, t=7, o=t-6 -> offset = 2 * r 
const rev1 = reverseArray(arr);
console.log(rev1);

arr = [1, 2, 3, 6, 8, 10, 11, 14, 19];      // t=4, o=1, t=5, o=3, t=6, o=5 -> offset = 2 * r - 1 
         // [1, 2, 3, 6, 8, 10, 11, 14, 19]   // t=5, o=t-2, t=6, o=t-4, t=7, o=t-6 -> offset = 2 * r 
const rev2 = reverseArray(arr);
console.log(rev2);

arr = [];
const rev3 = reverseArray(arr);
console.log(rev3);
