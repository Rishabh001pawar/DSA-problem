package ARRAY;

class leetcode2195 {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(EvenNo(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }
    static int EvenNo(int num){
        int digit=0;
        while(num!=0){
            num = num /10;
            digit++;
        }
        return digit;
    }
}