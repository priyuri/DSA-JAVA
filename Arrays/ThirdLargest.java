import java.util.List;
import java.util.*;

public class ThirdLargest {
    public static int thirdLargest(List<Integer> arr) {
        // code here
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            if (largest < arr.get(i)) {
                thirdLargest = secLargest;
                secLargest = largest;
                largest = arr.get(i);
            } else if (secLargest < arr.get(i) && largest >= arr.get(i)) {
                thirdLargest = secLargest;
                secLargest= arr.get(i);
            }else if(thirdLargest < arr.get(i) && secLargest >= arr.get(i)){
                thirdLargest = arr.get(i);
            }
        }
        if (thirdLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return thirdLargest;

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(1);
        arr.add(4);
        arr.add(5);
        // thirdLargest(arr);
        System.out.println(thirdLargest(arr));

    }
}
