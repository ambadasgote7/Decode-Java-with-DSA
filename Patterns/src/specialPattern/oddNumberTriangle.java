package specialPattern;

import java.util.Scanner;

public class oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                    System.out.print(2*cols-1 + " ");
            }
            System.out.println();
        }


//        for (int rows = 1; rows <= n; rows++) {
//            for (int cols = 1; cols <= 2*rows-1; cols+=2) {
//                System.out.print(cols + " ");
//            }
//            System.out.println();
//        }

//        for (int rows = 1; rows <= n; rows++) {
//            int a = 1;
//            for (int cols = 1; cols <= rows; cols++) {
//                System.out.print(a + " ");
//                a += 2;
//            }
//            System.out.println();
//        }

    }
}
