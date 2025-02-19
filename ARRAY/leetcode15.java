//  Brute force solution
import java.util.*;
class leetcode15{
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s= new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> trip=new ArrayList<>();
                        Collections.sort(trip);

                        if(!s.contains(trip));
                        s.add(trip);
                        ans.add(trip);
                    }
                }
            }
        }
        return ans;
    }
}