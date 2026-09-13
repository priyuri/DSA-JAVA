package Strings;

public class ConsonentsandVowels {
    public static void checkString(String str) {
        int countCons = 0;
        int countVowel = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                countVowel++;
            } else if (str.charAt(i) != ' ') {
                countCons++;
            }
        }
        if (countVowel > countCons) {
            System.out.println("Yes");
        } else if (countVowel == countCons) {
            System.out.println("Same");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        String str = "abab";
        checkString(str);
    }
}
