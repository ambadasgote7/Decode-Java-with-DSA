package triangles;

import java.util.Scanner;

public class HW_5_reverseAlphabetTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

//        A B C D
//        A B C
//        A B
//        A


//        for (int rows = 1 ; rows <= n ; rows++) {
//            for (int cols = 1; cols <= n+1-rows ; cols++) {
//                    System.out.print((char)(cols+64) + " ");
//            }
//            System.out.println();
//        }


//        A A A A
//        B B B
//        C C
//        D

        for (int rows = 1 ; rows <= n ; rows++) {
            for (int cols = 1; cols <= n+1-rows ; cols++) {
                System.out.print((char)(rows+64) + " ");
            }
            System.out.println();
        }
        
    }
}
