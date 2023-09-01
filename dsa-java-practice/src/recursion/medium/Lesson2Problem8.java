/**
 * 
 */
package recursion.medium;

import java.util.HashSet;

/**
 * Print unique subsequences of all characters in a string using recursion
 * Example for abc the possible values are 
 *  a->                 a    _
 *  b->      ab   a_         _b        __
 *  c->  abc ab_  a_c a__    _bc _b_   __c ___
 * 
 * Total sample space = { abc, ab_, a_c, a__, _bc, _b_, __c,___ } i.e { abc, ab, ac, a, bc, b, c, _ }
 * i.e { abc, ab, bc, ac, a, b, c, _ }
 * 
 *  a->                 a    _
 *  a->      aa   a_         _a        __
 *  a->  aaa aa_  a_a a__    _aa _a_   __a ___
 * 
 * Total sample space = { aaa, aa_, a_a, a__, _aa, _a_, __a,___ } i.e { aaa, aa, aa, a, aa, a, a, _ }
 * i.e { aaa, aa, a, ac, _ }
 * 
 * 
 * Time Complexity: O(2^n)
 */
public class Lesson2Problem8 {

	private static void subsequences(String input, int index, String output, HashSet<String> set) {
		// Base case
        if (input == null || input.length() == 0) {
            System.out.println("NO DATA");
            return;
        }
        if (input.length() == index) {
            if (!set.contains(output)) {
                System.out.println(output);
                set.add(output);
            }
            return;
        }

        // include current character
        subsequences(input, index + 1, output + input.charAt(index), set);
        
        // ignore current character
        subsequences(input, index + 1, output, set);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
		String input1 = "abc";
        System.out.println("Unique Subsequence of " + input1 + ":");
        subsequences(input1, 0, "", set1);

        HashSet<String> set2 = new HashSet<String>();
        String input2 = "aba";
        System.out.println("Unique Subsequence of " + input2 + ":");
        subsequences(input2, 0, "", set2);

        HashSet<String> set3 = new HashSet<String>();
        String input3 = "aaa";
        System.out.println("Unique Subsequence of " + input3 + ":");
        subsequences(input3, 0, "", set3);

        HashSet<String> set4 = new HashSet<String>();
        String input4 = "";
        System.out.println("Unique Subsequence of " + input4 + ":");
        subsequences(input4, 0, "", set4);

        HashSet<String> set5 = new HashSet<String>();
        String input5 = null;
        System.out.println("Unique Subsequence of " + input5 + ":");
        subsequences(input5, 0, "", set5);
	}
}
