package ARRAY;
// 217. Contains Duplicate leetcode
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Example 1:
// Input: nums = [1,2,3,1]
// Output: true
// Explanation
// The element 1 occurs at the indices 0 and 3.
// Example 2:
// Input: nums = [1,2,3,4]
// Output: false
// Explanation:

// All elements are distinct.
// Example 3:
// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true
import java.util.Arrays;
class array4{
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[]args){
        int arr[]={1,2,4,5};
        array4 a = new array4();
        System.out.println(a.containsDuplicate(arr));
    }
}

// ---------------------------------------------------------------------------------------------------------------------
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
               return true;
            }  
        }
        return false;    
    }
}