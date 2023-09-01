/**
 * 
 */
package recursion.medium;

/**
 * Print if the array is sorted (strictly increasing) using recursion
 * Example: Return true if arr = {2, 6, 9, 10, 56} and false if arr = {1, 2, 3, 4, 4, 5, 9} or arr = {} or arr = {7, 6, 8, 9}
 * Time Complexity: O(n)
 */
public class Lesson2Problem4 {

	private static boolean isArraySortedIncreasing(int[] input, int index) {
	    // Base case
        if (input == null || input.length == 0) {
            return false;
        }
        if (index == input.length - 1) {
            return true;
        }
        if (input[index] < input[index + 1]) {
            return isArraySortedIncreasing(input, index + 1);
        } else {
            return false;
        }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        int [] inputArr1 = {2, 6, 9, 10, 56};
        boolean isSorted = isArraySortedIncreasing(inputArr1, 0);
        System.out.println("Array " + inputArr1.toString() + " is sorted: " + isSorted);

        int [] inputArr2 = {1, 2, 3, 4, 4, 5, 9};
        isSorted = isArraySortedIncreasing(inputArr2, 0);
        System.out.println("Array " + inputArr2.toString() + " is sorted: " + isSorted);

        int [] inputArr3 = {};
        isSorted = isArraySortedIncreasing(inputArr3, 0);
        System.out.println("Array " + inputArr3.toString() + " is sorted: " + isSorted);

        int [] inputArr4 = {7, 6, 8, 9};
        isSorted = isArraySortedIncreasing(inputArr4, 0);
        System.out.println("Array " + inputArr4.toString() + " is sorted: " + isSorted);
	}
}
