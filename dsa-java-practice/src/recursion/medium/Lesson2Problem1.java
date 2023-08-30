/**
 * 
 */
package recursion.medium;

/**
 * Print Steps to perform Tower of Hanoi operation using recursion
 * Time Complexity: O(2^n)
 */
public class Lesson2Problem1 {

	private static void printStepsForTowerOfHanoi(int numDisks, String src, String helper, String dest) {
		// Base case
		if (numDisks == 1) {
			System.out.println("Transfer disk " + numDisks + " from " + src + " to " + dest);
			return;
		}
		printStepsForTowerOfHanoi(numDisks - 1, src, dest, helper);
		System.out.println("Transfer disk " + numDisks + " from " + src + " to " + dest);
		printStepsForTowerOfHanoi(numDisks - 1, helper, src, dest);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 3;
		printStepsForTowerOfHanoi(n, "S", "H", "D");
	}

}
