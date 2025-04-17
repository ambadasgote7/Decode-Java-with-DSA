package specialPattern;

import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

//        1
//        2 3
//        4 5 6
//        7 8 9 10

        int a = 1;
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }
}
