package squares;

import java.util.Scanner;

public class rectanglePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int n = sc.nextInt();



        for (int rows = 1 ; rows <= m ; rows++) {
            for (int cols = 1; cols <= n ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}