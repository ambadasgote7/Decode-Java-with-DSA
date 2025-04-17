package triangles;

import java.util.Scanner;

public class HW_4_reverseNumberTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

//        1 2 3 4
//        1 2 3
//        1 2
//        1


//        for (int rows = 1 ; rows <= n ; rows++) {
//            for (int cols = 1; cols <= n+1-rows ; cols++) {
//                    System.out.print(cols + " ");
//            }
//            System.out.println();
//        }

//        1 1 1 1
//        2 2 2
//        3 3
//        4

        for (int rows = 1 ; rows <= n ; rows++) {
            for (int cols = 1; cols <= n+1-rows ; cols++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }

    }
}
