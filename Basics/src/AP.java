import java.util.Scanner;

public class AP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        // Method 1 - Maths Formula   ( An = a + (n -1) * d) ) => Formula

        // for 1,3,5,....
//        for (int i = 1 ; i<= 2*n-1; i+=2) {
//            System.out.print(i + " ");
//        }

        // for 4,7,10,....
//        for (int i = 1 ; i<= 3*n+1; i+=3) {
//            System.out.print(i + " ");
//        }

        // Method 2 - without nth term formula

        // for 4,7,10,....
        int a = 4, d = 3;
        for (int i = 1 ; i<= n; i++) {
            System.out.print(a + " ");
            a += d;
        }

        }

}
