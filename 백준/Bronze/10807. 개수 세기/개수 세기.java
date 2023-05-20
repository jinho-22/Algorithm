import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //배열의 길이 받아오기
        int[] a= new int[N];//배열의 길이 선언
        int v=0;

        for(int i=0; i<N; i++){
            a[i]=sc.nextInt(); //배열에 값넣기
        }
        int z = sc.nextInt();
        for(int i=0;i<N;i++){
            if(z==a[i]){
                v++;
            }
        }
        System.out.println(v);
    }
} 