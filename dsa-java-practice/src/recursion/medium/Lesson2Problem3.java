/**
 * 
 */
package recursion.medium;

/**
 * Print the first and last occurence of a character in a string using recursion
 * Time Complexity: O(n)
 */
public class Lesson2Problem3 {

    private static int first = -1;
    private static int last = -1;

	private static void findOccurence(String input, char find, int index) {
		// Base case
        if (index == input.length()) {
            System.out.println("First occurence of " + find + " in " + input + "is at index: " + first);
            System.out.println("Last occurence of " + find + " in " + input + "is at index: " + last);
            return;
        }
		if (input.charAt(index) == find) {
            if (first == -1) {
                first = index;
                last = index;
            } else {
                last = index;
            }
        }
        findOccurence(input, find, index + 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        char find = 'a';
        int index = 0;
		String input = "abaacdaefaaaa898ahiuiui";
		// String input = "cvgbakjhkljlkjgkjjkjgut";
        findOccurence(input, find, index);
	}
}
