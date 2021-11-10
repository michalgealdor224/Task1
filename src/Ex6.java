import java.util.Scanner;

public class Ex6 {

    public static void invoiceSeries1(int firstLimb, int remainder, int amountOrgans) {
        for (int i = 0; i < amountOrgans; i++) {
            System.out.println(firstLimb);
            firstLimb = firstLimb + remainder;
        }

    }

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter First limb");
        int firstLimb = scanner.nextInt();
        System.out.println("enter remainder");
        int remainder = scanner.nextInt();
        System.out.println("enter Amount of organs");
        int amountOrgans = scanner.nextInt();
        invoiceSeries1(firstLimb, remainder, amountOrgans);

    }
}