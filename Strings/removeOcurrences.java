package Strings;

import java.util.*;

public class removeOcurrences {
    public static String removeOccurrences(String s, String part) {
        int index = s.indexOf(part);
        while (index != -1) {
            s = s.substring(0, index) + s.substring(index + part.length());
            index = s.indexOf(part);
        }
        return s;

    }

    public static void main(String[] args) {
        String s = "axxxxyyyyb";
        String part = "xy";
        System.out.println(removeOccurrences(s, part));   
    }
}
