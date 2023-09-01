/**
 * 
 */
package recursion.medium;

/**
 * Move all 'x' to the end of a given string using recursion
 * Example: Return abcdxxxx if input is axbcxxd
 * Time Complexity: O(n)
 */
public class Lesson2Problem5 {

	private static String moveAllX(String input, String output, int index, String xString) {
	    // Base case
        if (input == null || input.length() == 0) {
            return "NO DATA";
        }
        if (index == input.length()) {
            return output + xString;
        }
        if (input.charAt(index) == 'x') {
            xString += input.charAt(index);
        } else {
            output += input.charAt(index);
        }
        return moveAllX(input, output, index + 1, xString);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        String input1 = "axbcxxd";
        String output1 = moveAllX(input1, "", 0, "");
        System.out.println("Output of input " + input1 + " is: " + output1);

        String input2 = "axbcxxdxxpxxx";
        String output2 = moveAllX(input2, "", 0, "");
        System.out.println("Output of input " + input2 + " is: " + output2);

        String input3 = "";
        String output3 = moveAllX(input3, "", 0, "");
        System.out.println("Output of input " + input3 + " is: " + output3);

        String input4 = null;
        String output4 = moveAllX(input4, "", 0, "");
        System.out.println("Output of input " + input4 + " is: " + output4);
	}
}
