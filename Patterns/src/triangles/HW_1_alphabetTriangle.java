package triangles;

import java.util.Scanner;

public class HW_1_alphabetTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

//        A
//        A B
//        A B C
//        A B C D

        for (int rows = 1 ; rows <= n ; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print((char)(cols+64) + " ");
            }
            System.out.println();
        }
    }
}
