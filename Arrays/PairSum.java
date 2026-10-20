import java.util.ArrayList;

public class PairSum {
    // public static boolean twoSum(ArrayList<Integer> list , int target){
        //brute force  O(n^2)
        // for(int i=0; i<list.size(); i++){
        //     for(int j=i+1; j<list.size(); j++){
        //         if(list.get(i) + list.get(j) == target){
        //             return true;
        //         }
        //     }
        // }
        // return  false;

        //two pointer  O(n)
    //     int left = 0;
    //     int right = list.size()-1;
    //     while(left < right){
    //         //case 1
    //         if(list.get(left) + list.get(right) == target){
    //             return true;
    //         }
    //         //case 2
    //         if(list.get(left) + list.get(right) < target){
    //             left++;
    //         }else{
    //             right--;
    //         }

    //     }
    //     return false;
    // }

    public static  ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        int left = 0;
        int right = arr.length-1;
        while(left != right){
            if(arr[left] + arr[right] == target){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(left+1);
                list.add(right+1);
                return list;
            }
            if(arr[left] + arr[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return new ArrayList<>();

    }
    public static void main(String[] args) {
        // ArrayList<Integer>list = new ArrayList<>();
        // list.add(2);
        // list.add(7);
        // list.add(11);
        // list.add(15);
        // int target = 9;
        // System.out.println(twoSum(list , target));
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(arr, target));
        
    }
}
