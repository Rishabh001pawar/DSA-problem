package ARRAY;
//215. Kth Largest Element in an Array


import java.util.Arrays;
public class leetcode215 {
    public int findkthlargest(int []nums,int k){
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }
}
