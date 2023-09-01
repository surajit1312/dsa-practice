/**
 * 
 */
package recursion.medium;

/**
 * Print all subsequences of all characters in a string using recursion
 * Example for abc the possible values are 
 *  a->                 a    _
 *  b->      ab   a_         _b        __
 *  c->  abc ab_  a_c a__    _bc _b_   __c ___
 * 
 * Total sample space = { abc, ab_, a_c, a__, _bc, _b_, __c,___ } i.e { abc, ab, ac, a, bc, b, c, _ }
 * i.e { abc, ab, bc, ac, a, b, c, _ }
 * 
 * 
 * Time Complexity: O(2^n)
 */
public class Lesson2Problem7 {

	private static void subsequences(String input, int index, String output) {
		// Base case
        if (input == null || input.length() == 0) {
            System.out.println("NO DATA");
            return;
        }
        if (input.length() == index) {
            System.out.println(output);
            return;
        }
        // include char
        subsequences(input, index + 1, output + input.charAt(index));

        // ignore char
        subsequences(input, index + 1, output);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input1 = "abc";
        System.out.println("Subsequence of " + input1 + ":");
        subsequences(input1, 0, "");

        String input2 = "aba";
        System.out.println("Subsequence of " + input2 + ":");
        subsequences(input2, 0, "");

        String input3 = "aaa";
        System.out.println("Subsequence of " + input3 + ":");
        subsequences(input3, 0, "");

        String input4 = "";
        System.out.println("Subsequence of " + input4 + ":");
        subsequences(input4, 0, "");

        String input5 = null;
        System.out.println("Subsequence of " + input5 + ":");
        subsequences(input5, 0, "");
	}
}
