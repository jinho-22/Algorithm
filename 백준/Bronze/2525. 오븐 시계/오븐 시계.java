import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D ;
        if(B+C>=60){
            B +=C;
            A += B/60;
            if(A>23){
                D=A-24;
                A=0;
                A=D;
            }
            System.out.println(A+" "+B%60);
        }else{
            System.out.println(A+" "+(B+C));
        }

        
    }
}