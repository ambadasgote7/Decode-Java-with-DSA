package triangles;

import java.util.Scanner;

public class starTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

//*
//* *
//* * *
//* * * *


        for (int rows = 1 ; rows <= n ; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
