import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x=sc.nextLine();
        String y=sc.nextLine();

        if(x.length() >= y.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

    }
}