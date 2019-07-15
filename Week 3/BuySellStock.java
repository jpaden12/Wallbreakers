/* Leetcode #121
    Say you have an array for which the ith element is the price of a given stock on day i.

    If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), 
    design an algorithm to find the maximum profit.

    Note that you cannot sell a stock before you buy one.
*/

public int maxProfit(int[] prices) {
    if (prices.length == 0) {
        return 0;
    }
    int gain = 0; 
    int min = prices[0]; 
    for (int i = 0; i < prices.length; i++) {
        if (prices[i] < min) {
                min = prices[i];

            }
        if ((prices[i] - min) > gain) {
            gain = prices[i] - min; 
        }
    }
    return gain;
    
}