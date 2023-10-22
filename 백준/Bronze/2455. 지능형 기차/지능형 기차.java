import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A=0;
        int x = 0;
        int y = 0;
        int z = 0;


        for(int i = 0; i < 4; i++) {

             x = sc.nextInt();
             y = sc.nextInt();
            z=z+y-x;
            if(A < z) {
                A=z;
            }


        }
        System.out.println(A);
        

    }
}