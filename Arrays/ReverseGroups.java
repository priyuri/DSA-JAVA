public class ReverseGroups {
    public static  void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;
        for(int i =0; i<arr.length; i+=k){  //create group
            int left = i;
            int right = Math.min(i+k-1 , n-1);

            //reverse
            while(left < right){
                int temp = arr[right];
                arr[right] = arr[left]; 
                arr[left] = temp;

                left++;
                right--;
            }
        }
        //print array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9};
        reverseInGroups(arr, 5);
        
    }
}
