
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        if (temp == 0) {
            count = 1;
        } else {
            if (temp < 0) {
                temp = -temp;
            }

            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
        }

        System.out.println("Number of Digits: " + count);

        sc.close();
    }
}