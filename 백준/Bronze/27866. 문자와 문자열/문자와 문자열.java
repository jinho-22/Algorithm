import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int n = sc.nextInt();
        n -= 1;

        System.out.println(str.charAt(n));
    }
}
