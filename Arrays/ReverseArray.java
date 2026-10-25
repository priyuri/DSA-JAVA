public class ReverseArray {
    public static void reverseTheArray(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

            left++;
            right--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        reverseTheArray(arr);
    }
}
