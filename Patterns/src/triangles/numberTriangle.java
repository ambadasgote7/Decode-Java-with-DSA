package triangles;

import java.util.Scanner;

public class numberTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        for (int rows = 1 ; rows <= n ; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
