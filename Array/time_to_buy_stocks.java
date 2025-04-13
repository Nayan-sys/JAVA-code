public class time_to_buy_stocks {
    class Solution {
        public static void  maxProfit(int[] prices) {
            int min=prices[0];
            int max=0;
            int n=prices.length;
            for(int i=0;i<n;i++){
                if(min>prices[i]){
                    min=prices[i];
                } else{
                    int profit = prices[i] - min;
                    if(profit > max){
                        max=profit;
                    }
                }
            }
            System.out.println(max);
            
    
        }
        public static void main(String []args){
            int prices[]={7,1,5,3,6,4};
            maxProfit(prices);

        }
    }
}
