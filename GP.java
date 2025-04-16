import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        // Method 2

        // GP- 1,2,4,8,...
//        int a = 1;
//        for (int i = 1; i <= n; i++) {
//            System.out.print(a + " ");
//            a *= 2;
//        }

        // GP - 3,12,48,...
        int a = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a *= 4;
        }

    }
}
