import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int reverseNum1 = reverseNumber(num1);
        int reverseNum2 = reverseNumber(num2);
        
        int max = Math.max(reverseNum1, reverseNum2);
        
        System.out.println(max);
        
        sc.close();
    }
    
    public static int reverseNumber(int num) {
        int result = 0;
        
        while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
        
        return result;
    }
}
