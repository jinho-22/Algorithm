import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // int N = sc.nextInt(); //배열의 길이 받아오기
        int[] a= new int[9];//배열의 길이 선언

        int y;
        int x=0;
        for(int i=0; i<9; i++){
            a[i]=sc.nextInt(); //배열에 값넣기
        }
        y=a[0];
        for(int i=1;i<9;i++){
            if(y<a[i]){
                y=a[i];
                x=i;
            }
        }
        System.out.println(y);
        System.out.println(x+1);
    }
} 