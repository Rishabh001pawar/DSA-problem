package ARRAY;
// Given an array arr[] of size n, which is sorted and then rotated around an unknown pivot, the task is to check whether there exists a pair of elements in the array whose sum is equal to a given target value.
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

import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            if(i==k-1){
               return nums[i];
            }
        }
        return -1;
    }
}

