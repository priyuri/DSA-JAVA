public class MostWater {
    public static  int maxWater(int arr[]) {
        // Code Here
        int maxWater = 0;
        int left = 0;
        int right = arr.length-1;
        while(left != right){
            int width = right - left;
            int height = Math.min(arr[left] , arr[right]);
            int currWater = width * height;
            maxWater = Math.max(maxWater , currWater);
            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;

    }
    public static void main(String[] args) {
        int[] arr = { 2, 1, 8, 6, 4, 6, 5, 5};
        System.out.println(maxWater(arr));
    }
}
