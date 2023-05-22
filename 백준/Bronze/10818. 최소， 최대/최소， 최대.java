import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //배열의 길이 받아오기
        int[] a= new int[N];//배열의 길이 선언

        int x;
        int y;
        for(int i=0; i<N; i++){
            a[i]=sc.nextInt(); //배열에 값넣기
        }
        y=a[0];
        x=a[0];
        for(int i=1;i<N;i++){
            if(y<a[i]){
                y=a[i];
            }
            if(x>a[i]){
                x=a[i];
            }
        }
        System.out.println(x+" "+y);

    }
} 