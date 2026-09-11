package Strings;

public class shortestPath2 {
    public static String shortestPath(String s) {
        // code here
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                x++;
            } else if (s.charAt(i) == 'W') {
                x--;
            } else if (s.charAt(i) == 'N') {
                y++;
            } else {
                y--;
            }
        }

        StringBuilder result = new StringBuilder(" ");
        while (x > 0) {
            result.append('E');
            x--;
        }
        while (x < 0) {
            result.append('W');
            x++;
        }
        while (y > 0) {
            result.append('N');
            y--;
        }
        while (y < 0) {
            result.append('S');
            y++;
        }
        return result.toString();

    }

    public static void main(String[] args) {
        String s = "NNNWWW";

        System.out.println(shortestPath(s));

    }
}
