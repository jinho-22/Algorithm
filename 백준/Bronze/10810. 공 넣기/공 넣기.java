import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //배열의 길이 받아오기
        int[] a= new int[N];//배열의 길이 선언
        int M = sc.nextInt();

        for(int i = 0;i<M;i++){
            
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                for(int k=A-1;k<B;k++){
                    a[k]=C;
                
                
            }
            
            
            
        }
            for(int j = 0;j<N;j++){
               System.out.print(a[j]+" "); 
            }
    }
}