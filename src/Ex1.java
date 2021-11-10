import java.util.Scanner;

public class Ex1 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter int number");
        int intNumber = scanner.nextInt();
        intNumber = Math.abs(intNumber);
        System.out.println(intNumber);
    }
}
