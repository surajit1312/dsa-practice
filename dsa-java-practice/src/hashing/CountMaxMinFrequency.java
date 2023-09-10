package hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array 'v' of 'n' numbers
 * Your task is to find and return the highest and lowest frequency elements.
 * If there are multiple elements that have the highest frequency or lowest
 * frequency, pick the smallest element.
 *
 * Example:
 *
 * Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]
 * Output: 1 2
 * Explanation: The element having the highest frequency is '1', and the
 * frequency is 3.
 * The elements with the lowest frequencies are '2', '3', and '4'. Since we need
 * to pick
 * the smallest element, we pick '2'. Hence we return [1, 2].
 *
 * Link:
 * https://www.codingninjas.com/studio/problems/k-most-occurrent-numbers_625382
 *
 */
public class CountMaxMinFrequency {

    private static int[] getFrequencies(int[] v) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int high = Integer.MIN_VALUE, low = Integer.MAX_VALUE, smallestLow = Integer.MAX_VALUE,
                smallestHigh = Integer.MAX_VALUE;
        int[] cap = new int[2];
        for (int i = 0; i < v.length; i++) {
            if (map.containsKey(v[i])) {
                map.put(v[i], map.get(v[i]) + 1);
            } else {
                map.put(v[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= high) {
                high = entry.getValue();
            }
            if (entry.getValue() <= low) {
                low = entry.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == high && entry.getKey() < smallestHigh) {
                smallestHigh = entry.getKey();
            }
            if (entry.getValue() == low && entry.getKey() < smallestLow) {
                smallestLow = entry.getKey();
            }
        }
        cap[0] = smallestHigh;
        cap[1] = smallestLow;
        return cap;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] input1 = { 1, 2, 3, 1, 1, 4 };
        int[] output1 = getFrequencies(input1);
        for (Integer s : output1) {
            System.out.println(s);
        }

        int[] input2 = {16, 11, 13, 3, 14, 17, 3, 7, 9, 1, 11, 9, 15, 5, 2, 2, 3, 5, 5};
        int[] output2 = getFrequencies(input2);
        System.out.println(output2);
        for (Integer s : output2) {
            System.out.println(s);
        }
    }
}
