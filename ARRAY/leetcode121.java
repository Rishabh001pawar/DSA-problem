package ARRAY;
class leetcode121{
    public int maxProfit(int[] prices){
        int n=prices.length;
        int maxprofit=0;
        int bestBuy=prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]<bestBuy){
                bestBuy=prices[i];
            }
            else {
                maxprofit=Math.max(maxprofit,prices[i]-bestBuy);
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        leetcode121 s = new leetcode121();
        System.out.println(s.maxProfit(arr));
    }
}