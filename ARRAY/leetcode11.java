package ARRAY;
class leetcode11{
    public int maxArea(int[] nums){
        int n=nums.length;
        int res=0;
        int l=0;
        int r=n-1;

        while(l<r){
            int ans=Math.max(nums[l],nums[r])*(l-r);
            res= Math.min(res,ans);

            if(nums[l]<nums[r]) l++;
            else r--;
        }
        return res;
    }
}