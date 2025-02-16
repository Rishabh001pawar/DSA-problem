package ARRAY;
// 42. Trapping Rain Water

class leetcode42{
    public int trap(int[]arr){
        int n=arr.length;
        int[] maxR=new int [n];
        maxR[0]=arr[0];

        for(int i=0;i<n;i++){
            maxR[i]=Math.max(maxR[i-1],arr[i]);
        }

        int maxB=arr[n-1],res=0;
        for(int i=n-1;i>=0;i--){
            maxB=Math.max(maxB,arr[i]);
            res+=Math.min(maxR[i],maxB)-arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={4,2,0,3,2,5};
        leetcode42 instance = new leetcode42();
        System.out.println(arr[0]);
    }
}