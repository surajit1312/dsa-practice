/**
 *
 */
package recursion.easy;

/**
 * Calculate x^n for any given x and n values using recursion and stack height log n
 *                                  x^n
 *                                 /   \
 *                                /     \
 *                           x^(n/2) *   x^(n/2)
 *                           /   \        /    \
 *                          /    \       /      \
 *                  x^(n/4) * x^(n/4) x^(n/4) * x^(n/4)
 */
public class Lesson1Problem6 {

	private static double calculatePowerOfNumber(int number, int power) {
		// Base case 1
		if (power == 0) {
			return 1;
		}
		// Base case 2
		if (number == 0) {
			return 0;
		}
		if (power % 2 == 0) {
			return (calculatePowerOfNumber(number, power / 2) * calculatePowerOfNumber(number, power / 2));
		} else {
			return (number * calculatePowerOfNumber(number, power / 2) * calculatePowerOfNumber(number, power / 2));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 5, n = 3;
		System.out.println("x : " + x + ", n: " + n);
		double result = calculatePowerOfNumber(x, n);
		System.out.println("x^n: " + result);
		x = 2;
		n = 18;
		System.out.println("x : " + x + ", n: " + n);
		result = calculatePowerOfNumber(x, n);
		System.out.println("x^n: " + result);
	}
}
