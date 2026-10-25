public class demo {
    public static int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest <= arr[i]){
                secLargest = largest;
                largest = arr[i];
            }else if(secLargest < arr[i] && largest > arr[i]){
                secLargest = arr[i];
            }
        }
        if(secLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secLargest;

    }
    public static void main(String[] args) {
        int[] arr = { 28078, 19451, 935, 28892, 2242, 3570, 5480, 231};
        System.out.println(getSecondLargest(arr));
    }
}
