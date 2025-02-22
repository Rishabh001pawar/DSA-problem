package ARRAY;
// Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.
// Examples:
// Input: arr[] = {3, 5, 4, 1, 9}
// Output: Minimum element is: 1
//               Maximum element is: 9
// Input: arr[] = {22, 14, 8, 17, 35, 3}
// Output:  Minimum element is: 3
//               Maximum element is: 35
class solution{
    public static int setmini(int[]a,int n){
        int min=a[0];
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public static int setmax(int[]a,int n){
        int max=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
        public static void main(String[]args){
        int a[]={3,5,4,1,9};
        int n=a.length;
        System.out.println("Minimum element is: "+setmini(a,n));
        System.out.println("Maximum element is: "+setmax(a,n));
    }
}

// ------------------------------------------------------------------------------------------------------------
class array{
   public int minimumDeletions(int[] nums){
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minIndex=0;
        int maxIndex=0;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
            if(nums[i]>max){
               max=nums[i];
               maxIndex=i;
            }
        }
        int left=Math.max(minIndex,maxIndex)+1;
        int right=Math.max(n-minIndex,n-maxIndex);   
        int both = Math.min((minIndex+1)+(n-maxIndex),(maxIndex+1)+(n-minIndex));
        return Math.min(both,Math.min(left,right));     
    }
}