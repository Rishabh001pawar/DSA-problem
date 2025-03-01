//find the Position of an Element in Infinite Sorted Array

package ARRAY;

public class binary{
    public int search(int[] nums, int target) {
        int left=0;
        int right=1;
        while(nums[right]<target){
            left=right;
            right=right*2;
        } 
        right = Math.min(right, nums.length - 1);
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums={3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target=10;
        binary obj=new binary();
        System.out.println(obj.search(nums,target));
    }
}

//find the Position of an Element in Infinite Sorted Array

// package ARRAY;

// public class binary{
//     public int search(int[] nums, int target) {
//         int left=0;
//         int right=1;
//         while(nums[right]<target){
//             left=right;
//             right=right*2;
//         }
//         return right;
//     }
//     public int findposition(int[] nums, int target, int left, int right){
//         while(left<=right){
//             int mid=left+(right-left)/2;
//             if(nums[mid]==target){
//                return mid;
//             }
//             else if(nums[mid]>target){
//                 right=mid-1;
//             }
//             else{
//                 left=mid+1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int[] nums={3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
//         int target=10;
//         binary obj=new binary();
//         System.out.println(obj.search(nums,target));
//     }
// }