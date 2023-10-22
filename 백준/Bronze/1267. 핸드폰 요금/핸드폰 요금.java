import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b;
        int Y=0;
        int M=0;

        for(int i = 0; i < a; i++) {
            b = sc.nextInt();
            Y += ((b/30) +1) *10;
            M += ((b/60) +1) *15;
        }

        if(Y == M) {
            System.out.println("Y M " + Y);
        } else if(Y<M) {
            System.out.println("Y " + Y);
        }else if(Y>M) {
            System.out.println("M " + M);
        }

    }
}