public class mergeArray {
    public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0; 
        for(int i=0; i<m; i++){
            if(nums1[i] >= nums2[j]){
                //swap
                int temp = nums1[i+1];
                nums1[i+1] = nums1[i];
                nums1[i] = nums2[j];
                nums1[i+2] = temp;
                j++;
            }
        }

    }
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, m, nums2, n);

    }
}
