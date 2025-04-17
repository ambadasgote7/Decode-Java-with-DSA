import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        int temp = n;

        int sum = 0;
        while(n != 0) {
            int rem = n%10;
            sum += rem;
            n /= 10;
        }

        System.out.println("The sum of digits " + temp + " is " + sum);
    }
}
