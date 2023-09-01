/**
 * 
 */
package recursion.medium;

/**
 * Print keypad combination using recursion
 * Time Complexity: O(4^n)
 */
public class Lesson2Problem9 {
    private static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

	private static void printKeypadCombination(String input, int index, String combinations) {
		// Base case
        if (input == null || input.length() == 0) {
            System.out.println("NO DATA");
            return;
        }
        if (input.length() == index) {
            System.out.println(combinations);
            return;
        }
		char curr = input.charAt(index);
        String mapping = keypad[curr - '0'];
        
        for(int i = 0; i < mapping.length(); i++) {
            printKeypadCombination(input, index + 1, combinations + mapping.charAt(i));
        }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        String input1 = "23";
        System.out.println("Possible combinations for " + input1 + " are: ");
		printKeypadCombination(input1, 0, "");

        String input2 = "456";
        System.out.println("Possible combinations for " + input2 + " are: ");
		printKeypadCombination(input2, 0, "");

        String input3 = "";
        System.out.println("Possible combinations for " + input3 + " are: ");
		printKeypadCombination(input3, 0, "");

        String input4 = null;
        System.out.println("Possible combinations for " + input4 + " are: ");
		printKeypadCombination(input4, 0, "");
	}
}
