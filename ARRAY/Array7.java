// Pair Sum in a Sorted and Rotated Array
package ARRAY;
// public Given an array arr[] of size n, which is sorted and then rotated around an unknown pivot, the task is to check whether there exists a pair of elements in the array whose sum is equal to a given target value.
// Examples :
// Input: arr[] = [11, 15, 6, 8, 9, 10], target = 16
// Output: true
// Explanation: There is a pair (6, 10) with sum 16.
// Input: arr[] = [11, 11, 15, 26, 38, 9, 10], target = 35
// Output: true
// Explanation: There is a pair (26, 9) with sum 35.
// Input: arr[] = [9, 10, 10, 11, 15, 26, 38], target = 45
// Output: false
// Explanation: There is no pair with sum 45. 

class Array7 {
    static boolean pairInSortedRotated(int[] arr, int target) {
        int n = arr.length;
        int i;

        // Find the index of the largest element
        for (i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
         }
        int S = i + 1; // Start of the second half
        int L = i;     // End of the first half
        while (S != L) {
            int sum = arr[S] + arr[L];
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                S++;
                if (S >= n) {
                    S = 0; // Wrap around to the start of the array
                }
            } else {
                L--; // Move to the previous element in the first half
                // Reset L if it goes below zero
                if (L < 0) {
                    L = n - 1; // Wrap around to the end of the array
                }
            }
        }
        return false; // No pair found
    }
 public static void main(String[] args) {
     int[] arr = {11, 15, 6, 8, 9, 10};
     int target = 16;
     if (pairInSortedRotated(arr, target)) System.out.println("true");
     else System.out.println("false");
    }
}