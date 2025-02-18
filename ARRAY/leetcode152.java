package ARRAY;

public class leetcode152 {
    public int maxProduct(int[] nums){
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int prefix=1;
        int suffix=1;
        for(int i=0;i<n;i++){
            prefix=prefix*nums[i];
            suffix=suffix*nums[n-i-1];
            max=Math.max(max,Math.max(prefix,suffix));

            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
        }
        return max;
    }
    public static void main(String[] args) {
        int []nums={2,3,-2,4};
        leetcode152 sol=new leetcode152();
        System.out.println(sol.maxProduct(nums));
    }
}
