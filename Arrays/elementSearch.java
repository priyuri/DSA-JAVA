class Solution {
    public static int search(int arr[], int x) {
        // code here
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4};
        int x = 3;
        int ans = search(arr , x);
        System.out.println(ans);
    }
}
