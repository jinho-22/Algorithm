import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] baskets = new int[n+1];

        for (int i = 1; i <= n; i++) {
            baskets[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            reverseBaskets(baskets, start, end);
        }

        
        for (int i = 1; i <= n; i++) {
            System.out.print(baskets[i] + " ");
        }
    }

    
    private static void reverseBaskets(int[] baskets, int start, int end) {
        while (start < end) {
            int temp = baskets[start];
            baskets[start] = baskets[end];
            baskets[end] = temp;
            start++;
            end--;
        }
    }
}
