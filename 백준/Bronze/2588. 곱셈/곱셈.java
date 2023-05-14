import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String num = Integer.toString(num2);

        char a = num.charAt(2);
        char b = num.charAt(1);
        char c = num.charAt(0);

        System.out.println(num1*Character.getNumericValue(a));
        System.out.println(num1*Character.getNumericValue(b));
        System.out.println(num1*Character.getNumericValue(c));
        System.out.println(num1*num2);


        
        
        
    }
}