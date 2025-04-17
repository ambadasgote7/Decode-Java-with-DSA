package triangles;

import java.util.Scanner;

public class HW_3_alphabet_number_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

//        1
//        A B
//        1 2 3
//        A B C D

        for (int rows = 1 ; rows <= n ; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                if(rows%2 != 0) {
                    System.out.print(cols + " ");
                } else {
                    System.out.print((char)(cols+64) + " ");
                }
            }
            System.out.println();
        }
    }
}
