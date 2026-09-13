package Strings;

import java.util.*;

public class countVowels {
    public static int getcountofvowels(String str) {
        // brute force approach
        // int count =0;
        // for(int i=0; i<str.length(); i++){
        // if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
        // str.charAt(i) == 'o' || str.charAt(i) == 'u'){
        // count++;
        // }
        // }
        // return count;

        // 2nd approach
        str = str.toLowerCase();
        String vowel = "aeiou";
        int count = 0;

        ArrayList<Character> al = new ArrayList<>();

        for (int i = 0; i < vowel.length(); i++) {
            al.add(vowel.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if (al.contains(str.charAt(i))) {
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getcountofvowels(str));
    }
}
