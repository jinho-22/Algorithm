import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        
        long result = Math.abs(a - b);
        System.out.println(result);
        
        scanner.close();
    }
}
