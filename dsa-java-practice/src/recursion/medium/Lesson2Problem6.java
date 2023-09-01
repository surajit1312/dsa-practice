/**
 * 
 */
package recursion.medium;

/**
 * Remove duplicates from a string using recursion
 * Time Complexity: O(n)
 */
public class Lesson2Problem6 {

    private static boolean[] map = new boolean[26];

	private static String removeDuplicates(String input, int index, String output) {
		// Base case
        if (input == null || input.length() == 0) {
            return "NO DATA";
        }
        if (input.length() == index) {
            return output;
        }
		if (!map[input.charAt(index) - 'a']) {
            map[input.charAt(index) - 'a'] = true;
            output += input.charAt(index);
        }
        return removeDuplicates(input, index + 1, output);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input1 = "abbcbbccdeffgffaaa";
        String output1 = removeDuplicates(input1, 0, "");
        System.out.println("Output after removing duplicates from " + input1 + ": " + output1);

        String input2 = "";
        String output2 = removeDuplicates(input2, 0, "");
        System.out.println("Output after removing duplicates from " + input2 + ": " + output2);

        String input3 = null;
        String output3 = removeDuplicates(input3, 0, "");
        System.out.println("Output after removing duplicates from " + input3 + ": " + output3);
	}
}
