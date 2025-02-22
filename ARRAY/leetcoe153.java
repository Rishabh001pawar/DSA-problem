package ARRAY;
public class leetcoe153 {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0; 
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }else {
                high=mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int []nums={3,4,5,1,2};
        leetcoe153 sol=new leetcoe153();
        System.out.println(sol.findMin(nums));
    }
}
