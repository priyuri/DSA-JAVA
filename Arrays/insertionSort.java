public class insertionSort {
    public static void sortByInsertion(int[] arr){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > temp){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        sortByInsertion(arr);
    }
}
