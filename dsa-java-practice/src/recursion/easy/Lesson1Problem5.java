/**
 *
 */
package recursion.easy;

/**
 * Calculate x^n for any given x and n values using recursion and stack height n
 */
public class Lesson1Problem5 {

	private static double calculatePowerOfNumber(int number, int power) {
		// Base case 1
		if (power == 0) {
			return 1;
		}
		// Base case 2
		if (number == 0) {
			return 0;
		}
		return number * calculatePowerOfNumber(number, power - 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 18;
		int n = 5;
		System.out.println("x : " + x + ", n: " + n);
		double result = calculatePowerOfNumber(x, n);
		System.out.println("x^n: " + result);
	}
}
