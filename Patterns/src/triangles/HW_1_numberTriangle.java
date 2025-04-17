package triangles;

import java.util.Scanner;

public class HW_1_numberTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

//        1
//        2 2
//        3 3 3
//        4 4 4 4

        for (int rows = 1 ; rows <= n ; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }
}
