/**
 *
 */
package recursion;

/**
 * Print value of factorial of a given number using recursion
 */
public class Lesson1Problem3 {

  private static double calculateFactorial(int n) {
    if (n == 1 || n == 0) {
      return 1;
    }
    return n * calculateFactorial(n - 1);
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    int n = 100;
    double factorial = calculateFactorial(n);
    System.out.println("Factorial of " + n + " is : " + factorial);
  }
}
