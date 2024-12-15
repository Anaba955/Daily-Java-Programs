class Solution {
    public int maximumProfit(int prices[]) {
        int maxProfit = 0, minPrice=Integer.MAX_VALUE;
        for(int price : prices) {
            if(price < minPrice)
                minPrice = price;
            else if(price - minPrice > maxProfit)
                maxProfit = price - minPrice;
        }
        return maxProfit;
    }
}
