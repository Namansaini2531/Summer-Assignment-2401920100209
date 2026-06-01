package Week_1.Day_1;

class Best_time_to_buy_and_sell_stock {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        for(int i = 0 ; i<prices.length ; i++){
            for(int j = i+1; j<prices.length ; j++){
                int pro = prices[j]-prices[i];
                if(pro > maxPro){
                    maxPro = pro;
                }
            }
        }
    return maxPro;
    }
}
