package HashMap;
import java.util.*;

public class HashOperation {
    public static void main(String[] args) {
        //creating hashmap
        HashMap<String , Integer> hm = new HashMap<>();
        //put || insert operation
        hm.put("India" , 150);
        hm.put("Pakistan" , 15);
        hm.put("US" , 100);
        hm.put("Japan" , 20);

        System.out.println(hm);
        
        //get (value)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia")); // null

        //remove
        hm.remove("Pakistan");
        System.out.println(hm);

        //containsKey
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();

        //isEmpty
        System.out.println(hm.isEmpty());

    }
}
