/**
 *
 */
package recursion.easy;

/**
 * Print Sum of Numbers from 1 to n using recursion
 */
public class Lesson1Problem2 {

	private static void printSumOfNumbers(int current, int n, int sum) {
		sum += current;
		if (current == n) {
			System.out.println("Sum of numbers from 1 to 100: " + sum);
			return;
		}
		printSumOfNumbers(current + 1, n, sum);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 100;
		int current = 1;
		int sum = 0;
		printSumOfNumbers(current, n, sum);
	}
}
