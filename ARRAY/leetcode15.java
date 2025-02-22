//  Brute force solution
package ARRAY;
import java.util.*;
// class leetcode15{
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n=nums.length;
//         List<List<Integer>> ans = new ArrayList<>();
//         Set<List<Integer>> s= new HashSet<>();
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(nums[i]+nums[j]+nums[k]==0){
//                         List<Integer> trip=new ArrayList<>();
//                         Collections.sort(trip);

//                         if(!s.contains(trip));
//                         s.add(trip);
//                         ans.add(trip);
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
// }


// approach hasing

// class leetcode15{
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n=nums.length;
//         List<List<Integer>> ans = new ArrayList<>();
//         Set<List<Integer>> s= new HashSet<>();
//         for(int i=0;i<n;i++){
//             int target=-nums[i];
//             List<Integer> seen= new ArrayList<>();

//             for(int j=i+1;j<n;j++){
//                 int third=target-nums[i];
//                 if(seen.contains(third)){
//                     List<Integer> trip = Arrays.asList(nums[i], nums[j], third);
//                     Collections.sort(trip);
//                     s.add(trip);
//                 }
//                 seen.add(nums[j]);
//             }
//         }
//         s.addAll(s);
//         return ans;
//     }
// }

// two pointer

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);   
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for i
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}