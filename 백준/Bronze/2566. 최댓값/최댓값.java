import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int maxValue = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println(maxValue);
        System.out.println((maxRow + 1) + " " + (maxCol + 1));
    }
}
