import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while(n != 0) {
            n /= 10;
            count++;
        }
        System.out.println("The number of digits in " + temp + " are " + count);
    }
}
