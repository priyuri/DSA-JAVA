//https://leetcode.com/problems/missing-number/description/?utm_source=chatgpt.com
public class missingNum {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedValue = n*(n+1)/2;
        int actualValue = 0;
        for(int i=0; i<nums.length; i++){
           actualValue = actualValue + nums[i]; 
        }
        return expectedValue - actualValue;

    }
    public static void main(String[] args) {
        int[] nums = {0,1};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }
}
