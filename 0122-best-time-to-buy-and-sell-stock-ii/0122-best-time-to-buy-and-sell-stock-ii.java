class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int sell=0;
        int prev=0;
        int total=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<buy && i>prev ){
                buy =prices[i];
                prev=i;
            }
            if(prices[i]>sell && i>prev && buy<prices[i]){
                sell =prices[i];
            }
            
            if(sell-buy>0){
                total+=sell-buy;
                prev=i;
                sell=0;
                buy=prices[i];
            }
            
        }
        return total;
    }
}