import java.util.Scanner;

public class tableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
//        for(int i=1; i<=190; i++) {
//            if (i%n == 0) {
//                System.out.println(i);
//            }
//        }

        for(int i = n; i <= n * 10; i+=n) {
            System.out.println(i);
        }

//        for(int i = 1; i <= 10; i++) {
//            System.out.println(19 + " X " + i + " = " + (n*i));
//        }
    }
}
