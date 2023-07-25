import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();

        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            count[ch - 'A']++;
        }

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) ('A' + i);
            } else if (count[i] == maxCount) {
                maxChar = '?';
            }
        }

        System.out.println(maxChar);
    }
}
