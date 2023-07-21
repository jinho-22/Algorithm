import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] originalPieces = {1, 1, 2, 2, 2, 8};

        int[] inputPieces = new int[6];
        for (int i = 0; i < 6; i++) {
            inputPieces[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            int diff = originalPieces[i] - inputPieces[i];
            System.out.print(diff + " ");
        }
    }
}
