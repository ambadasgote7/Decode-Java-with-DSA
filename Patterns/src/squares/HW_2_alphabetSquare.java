package squares;

import java.util.Scanner;

public class HW_2_alphabetSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int n = sc.nextInt();


//        a b c d
//        a b c d
//        a b c d
//        a b c d


        for (int rows = 1 ; rows <= n ; rows++) {
            for (int cols = 1; cols <= n ; cols++) {
                System.out.print((char)(cols+96) +" ");
            }
            System.out.println();
        }
    }
}
