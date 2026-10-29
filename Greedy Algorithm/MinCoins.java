import java.util.*;

public class MinCoins {
    public static int findMin(int n) {
        // code here
        int[] coins = { 1, 2, 5, 10 };
        int count = 0;
        Arrays.sort(coins);
        for (int i = coins.length - 1; i >= 0; i--) {
            if(n >= coins[i]) {
                while (n >= coins[i]) {
                    n-=coins[i];
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findMin(39));

    }
}
