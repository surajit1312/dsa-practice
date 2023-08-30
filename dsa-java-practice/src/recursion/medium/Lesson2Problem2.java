/**
 * 
 */
package recursion.medium;

/**
 * Print reverse of a string using recursion
 * Time Complexity: O(n)
 */
public class Lesson2Problem2 {
	private static void printReverse(String str, int index) {
		// Base case
		if (index == -1) {
			return;
		}
		System.out.print(str.charAt(index));
		printReverse(str, index - 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyz";
		printReverse(s, s.length() - 1);
	}
}
