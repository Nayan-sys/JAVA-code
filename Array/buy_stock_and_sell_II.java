public class buy_stock_and_sell_II {
    
        public static void  maxProfit(int[] prices) {
           int Totalprofit=0;
           int n=prices.length;
           for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                Totalprofit+=prices[i]-prices[i-1];
            }
           }
           System.out.println("Total profit is "+Totalprofit);
        }
        public static void main(String[]args){
            int prices[]={7,1,5,3,6,4};
            maxProfit(prices);
        }
    }

