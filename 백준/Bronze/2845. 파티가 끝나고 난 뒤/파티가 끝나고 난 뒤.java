import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z=0;
        int A = x * y;

        for(int i = 0; i < 5 ; i++) {
            z = sc.nextInt();
            System.out.println(z-A);
        }
    }
}