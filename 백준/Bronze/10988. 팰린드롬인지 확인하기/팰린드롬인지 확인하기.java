import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean isPalindrome = true;
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
