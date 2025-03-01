package ARRAY;

public class leetcode34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = binarySearch(nums, target, true); 
        result[1] = binarySearch(nums, target, false); 
        return result;
    }
    private int binarySearch(int[] nums, int target, boolean findFirst) {
        int low = 0, high = nums.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                result = mid; 
                if (findFirst) {
                    high = mid - 1; 
                } else {
                    low = mid + 1; 
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
