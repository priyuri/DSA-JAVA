class largestElement {
    public static int largest(int[] arr) {
        // code here
        int max = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
        
    }
    public static void main(String args[]){
        int[] arr = {1,8,7,56,90};
        int ans = largest(arr);
        System.out.println(ans);
    }
}
