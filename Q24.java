
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        if (n > 0) {
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }
            }
        }

        if (n > 0 && sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }

        sc.close();
    }
}