package squares;

import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int n = sc.nextInt();


        for (int rows = 1 ; rows <= n ; rows++) {
            for (int cols = 1; cols <= n ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
