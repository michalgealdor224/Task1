
import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter number");
        int number1 = scanner.nextInt();
        System.out.println("enter more number");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        if (sum % 2 == 0 )
        {
            System.out.println( "the sum is even");
        }
        else System.out.println("the sum is odd");

    }




}

