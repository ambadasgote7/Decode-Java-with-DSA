package squares;

import java.util.Scanner;

public class HW_1_alphabetSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int n = sc.nextInt();

//        A A A A
//        B B B B
//        C C C C
//        D D D D

        for (int rows = 1 ; rows <= n ; rows++) {
            for (int cols = 1; cols <= n ; cols++) {
                System.out.print((char)(rows+64) +" ");
            }
            System.out.println();
        }
    }
}
