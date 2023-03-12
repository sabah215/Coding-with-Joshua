package Sabah;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Author: Sabah Ummie
 * Date: 09.05.22
 * 
 */
/** 
 * PROBLEM:
 * 
 *     Given two sorted arrays arr1 and arr2 of passport numbers,
       implement a function findDuplicates that returns an array of all passport numbers that are 
       both in arr1 and arr2. 
       Note that the output array should be sorted in an ascending order.
       Let N and M be the lengths of arr1 and arr2, respectively.
       Solve for two cases and analyze the time & space complexities of your solutions: 
       M ≈ N - the array lengths are approximately the same M ≫ N - arr2 is much bigger than arr1.
 * 
 * 
 * input:  arr1 = [1, 2, 3, 5, 6, 7], arr2 = [3, 6, 7, 8, 20]

output: [3, 6, 7] # since only these three values are both in arr1 and arr2
[time limit] 5000ms

[input] array.integer arr1

1 ≤ arr1.length ≤ 100
[input] array.integer arr2

1 ≤ arr2.length ≤ 100
*/

public class PassportNumbers {

       public static void main(String[] args) {
              int [] arr1 = {1, 2, 3, 5, 6, 7};
              int [] arr2 = {3, 6, 7, 8, 20, 45, 78, 79, 90, 89, 45};  
              
              System.out.print(findDuplicates(arr1, arr2));
       }

       static List<Integer> findDuplicates(int[] arr1, int[] arr2){
              // Time Complexity: O(nlogn)
              // Space : O(1)
              
              List<Integer> result = new ArrayList<>();


              // Loop over the smaller sized arr1

              for (int i = 0; i < arr1.length; i++) {
                       // Apply Binary Search

                       int s = 0, e= arr2.length; 
                       int mid = 0;
                     
                       while(s <= e){
                            // ...Start from here...
                       }
              }

                   




              return result;

       }

       
       
}
