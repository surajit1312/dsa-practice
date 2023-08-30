/**
 *
 */
package recursion.easy;

/**
 * Print Numbers 1 to 10 using recursion
 */
public class Lesson1Problem1 {

	private static void printNumbersAscendingOrder(int n) {
		if (n == 11) {
			return;
		}
		System.out.println(n);
		printNumbersAscendingOrder(n + 1);
	}

	private static void printNumbersDescending(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printNumbersDescending(n - 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int p = 1;
		System.out.println("Printing numbers in Ascending order from 1 to 10");
		printNumbersAscendingOrder(p);

		int q = 10;
		System.out.println("Printing numbers in Descending order from 10 to 1");
		printNumbersDescending(q);
	}
}
