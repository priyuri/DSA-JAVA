//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?utm_source=chatgpt.com
public class Stock {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            int temp = prices[i] - min;
            max = Math.max(max, temp);
        }
        return max;

    }

    public static void main(String[] args) {
        int[] prices = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(prices));
    }
}
