import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);
            System.out.println(firstChar + "" + lastChar);
        }
    }
}
