class secondLargest {
    public static int getSecondLargest(int[] arr) {
        // code here
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                second_largest= largest;
                largest = arr[i];
            }else if(arr[i] > second_largest && arr[i] < largest){
                second_largest = arr[i];
            }
        }
        if(second_largest == Integer.MIN_VALUE){
            return -1;
        }
        return second_largest;
        
    }
    public static void main(String args[]){
        int[] arr = {12,35,1,10,34,1};
        int ans = getSecondLargest(arr);
        System.out.println(ans);
    }
}
