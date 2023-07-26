import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];
        char prev = 0;

        for (char ch : word.toCharArray()) {
            if (prev != ch && visited[ch - 'a']) {
                return false;
            }

            visited[ch - 'a'] = true;
            prev = ch;
        }

        return true;
    }
}
