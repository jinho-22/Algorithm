import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[5];

        for (int i = 0; i < 5; i++) {
            strings[i] = sc.nextLine();
        }

        int maxLength = 0;
        for (String str : strings) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            for (String str : strings) {
                if (i < str.length()) {
                    result.append(str.charAt(i));
                }
            }
        }

        System.out.println(result.toString());
    }
}
