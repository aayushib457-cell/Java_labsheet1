
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        if (length > 0 && breadth > 0) {
            if (length == breadth) {
                System.out.println("It is a Square");
            } else {
                System.out.println("It is a Rectangle");
            }
        } else {
            System.out.println("Invalid Dimensions");
        }

        sc.close();
    }
}