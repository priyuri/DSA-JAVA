public class countingSort {
    public static void sortByCounting(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest , arr[i]);
        }

        //create new count array
        int[] count = new int[largest+1];
        //storing frequency of the numbers in an array
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting the numbers in original array
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        //printing an array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        sortByCounting(arr);
        
    }
}
