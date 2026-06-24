1class Solution {
2    public int maxProfit(int[] prices) {
3        int l = Integer.MAX_VALUE; 
4        int profit = 0; 
5        int sold = 0; 
6        
7        for(int i = 0; i < prices.length; i++){
8            if(prices[i] < l){ 
9                l = prices[i]; 
10            }
11            sold = prices[i] - l; 
12            if(profit < sold){
13                profit = sold;
14            }
15        }
16        return profit;
17    }
18}