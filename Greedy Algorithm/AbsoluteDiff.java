import java.util.Arrays;

public class AbsoluteDiff {
    public static int findMinSum(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        int minDiff = 0;
        int i = 0;
        while (i < a.length) {
            int ans = Math.abs(a[i] - b[i]);
            minDiff += ans;
            i++;
        }
        return minDiff;

    }

    public static void main(String[] args) {
        int[] a = { 4, 1, 8, 7 };
        int[] b = { 2, 3, 6, 5 };
        System.out.println(findMinSum(a, b));

    }
}
