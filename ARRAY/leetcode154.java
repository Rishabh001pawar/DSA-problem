package ARRAY;

public class leetcode154{
    public int findMin(int[] nums) {
        int n= nums.length;
        int left=0;
        int right=n-1;
        if(nums[left]<nums[right]){
            return nums[left];
        }
        while(left<right){
            int mid = left + (right - left) / 2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else if(nums[mid]<nums[left]){
                right=mid;
            }
            else{
                right--;
            }
        }
        return nums[right];
    }
}
// Time Complexity: O(logn)
// Space Complexity: O(1)
// Leetcode 154: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/