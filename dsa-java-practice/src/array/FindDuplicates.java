package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * You are given an array of integers 'ARR' containing N elements.
 * Each integer is in the range [1, N-1], with exactly one element 
 * repeated in the array.
 * 
 * Your task is to find the duplicate element. The duplicate element 
 * may be repeated more than twice in the error, but there will be 
 * exactly one element that is repeated in the array.
 * 
 * Link: https://www.codingninjas.com/studio/problems/find-duplicate-in-array_1112602
 */
public class FindDuplicates {
    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int repeated = Integer.MIN_VALUE;
        for (Integer i : arr) {
            if (map.containsKey(i)) {
                repeated = i;
                break;
            } else {
                map.put(i, 1);
            }
        }
        return repeated;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 4, 2 };
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int repeated = findDuplicate(list, list.size());
        System.out.println("Repeated element is: " + repeated);
    }
}
