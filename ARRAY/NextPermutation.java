package ARRAY;

// 31. Next Permutation
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=n-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot != -1){
            for(int i=n-1;i>pivot;i--){
                if(nums[i]>nums[pivot]){
                    swap(nums,i,pivot);
                }
            }
        }
        int i=pivot+1,j=n-1;
        while(j<=j){
            swap(nums,i++,j--);
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[]args){
        int arr[]={1,2,3};
        NextPermutation np = new NextPermutation();
        np.nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
