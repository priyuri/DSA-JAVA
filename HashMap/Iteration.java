package HashMap;
import java.util.*;

public class Iteration {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India" , 150);
        hm.put("Indonesia" , 100);
        hm.put("Kerala" , 50);
        hm.put("China" , 40);
        hm.put("US" , 10);

        Set<String> s = hm.keySet();
        System.out.println(s); //print keys

        for(String k : s){
            System.out.println("Key = "+k+" Value = "+hm.get(k));
        }
    }
}
