/**
 *
 */
package recursion.easy;

/**
 * Print fibonacci series till nth term using recursion
 */
public class Lesson1Problem4 {

	private static void printFibonacciTerm(int a, int b, int n) {
		if (n == 0) {
			return;
		}
		int c = a + b;
		System.out.println(c);
		printFibonacciTerm(b, c, n - 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10;
		int a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);
		printFibonacciTerm(a, b, n - 2);
	}
}
