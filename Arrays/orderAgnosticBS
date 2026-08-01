//In this problem we first check whether the array is sorted in ascending order or descending order. we have created variable isAsc 

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] nums = {40, 10, 5, 2, 1};
        int target = 5;
        int ans = search(nums , target);
        System.out.println(ans);
    }

    public static int search(int[] nums , int target){
        int start = 0;
        int end = nums.length-1;
        //find out is ascending or descending
        boolean isAscending ;
        if(nums[start]<nums[end]){
            isAscending=true;
        }else{
            isAscending=false;
        } 
        while(start<=end){
            int mid = start+(end-start);
            if(nums[mid]==target){
                return mid;
            }
            if(isAscending){
                if(target<nums[mid]){
                    end = mid-1;
                }else if(target>nums[mid]){
                    start = mid + 1;        
                }
            }else{
                if(target<nums[mid]){
                    start = mid+1;
                }else if(target > nums[mid]){
                    end = mid-1;
                }
            }

        }
        return -1;
    }

}
