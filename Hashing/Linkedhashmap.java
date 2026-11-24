package Hashing;
import java.util.*;

public class Linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
        lhm.put("India" , 150);
        lhm.put("Indonesia" , 100);
        lhm.put("China" , 50);
        lhm.put("Kerala" , 10);

        System.out.println(lhm);
    }
}
