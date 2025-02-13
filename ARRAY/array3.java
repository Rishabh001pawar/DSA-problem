package ARRAY;
// 53. Maximum Subarray leetcode
public class array3 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            if(sum<0){
                sum=0;
            } 
        }
        return max;
    }
    public static void main(String[]args){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        array3 a = new array3();
        System.out.println(a.maxSubArray(arr));
    }
}
