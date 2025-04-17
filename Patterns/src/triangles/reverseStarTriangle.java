package triangles;

import java.util.Scanner;

public class reverseStarTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

//* * * *
//* * *
//* *
//*


        for (int rows = 1 ; rows <= n ; rows++) {
            for (int cols = 1; cols <= n+1-rows ; cols++) {
                    System.out.print("*" + " ");
            }
            System.out.println();
        }

//        for (int rows = 1 ; rows <= n ; rows++) {
//            for (int cols = rows; cols <= n ; cols++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
