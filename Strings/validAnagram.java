package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()){
        // return false;
        // }
        // ArrayList<Character> al = new ArrayList<>();
        // for(int i=0; i<s.length(); i++){
        // al.add(s.charAt(i));
        // }

        // //check for char
        // for(int i=0; i<t.length(); i++){
        // char ch = t.charAt(i);
        // if(al.contains(ch)){
        // al.remove(Character.valueOf(ch));
        // }else{
        // return false;
        // }
        // }
        // return true;

        //2nd approach
        char[] arr1 = s.toCharArray();
        Arrays.sort(arr1);
        String st1 = new String(arr1);

        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);
        String st2 = new String(arr2);

        if(st1.equals(st2)){
            return true;
        }else{
            return false;
        }


    }

    public static void main(String[] args) {
        String s = "anagram55";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));

    }
}
