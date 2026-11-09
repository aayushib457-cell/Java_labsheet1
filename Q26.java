
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        if (num >= 10000 && num <= 99999) {
            int first = num / 10000;
            int last = num % 10;

            if (first == last) {
                System.out.println("First and Last Digits are Same");
            } else {
                System.out.println("First and Last Digits are Different");
            }
        } else {
            System.out.println("Invalid Five-Digit Number");
        }

        sc.close();
    }
}