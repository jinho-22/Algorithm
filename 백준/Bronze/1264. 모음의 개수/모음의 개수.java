import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        String str = "";
        while (true) {
            str = sc.nextLine().toLowerCase();
            if (str.equals("#")) {
                break;
            }

            String arr[] = str.split("");
            for (int i = 0; i < arr.length; i++) {

                if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o")
                        || arr[i].equals("u")) {
                    cnt++;
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }

}