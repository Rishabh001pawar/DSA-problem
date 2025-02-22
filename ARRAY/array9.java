// Find minimum number of merge operations to make an array palindrome
package ARRAY;

class array9 {
    static int findMinOps(int[] arr, int n){
        int ans=0;
        for (int i=0,j=n-1; i<=j;){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]>arr[j]){
                j--;
                arr[i]+=arr[j-1];
                ans++;
            }
            else{
                i++;
                arr[i]+=arr[j+1];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = new int[]{15, 4, 15} ;
        System.out.println("Count of minimum operations is "+
                                findMinOps(arr, arr.length));
    
    }
} 
// Java program to find number of operations
// to make an array palindrome

          
