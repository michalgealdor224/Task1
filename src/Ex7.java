import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of day");
        int day = scanner.nextInt();
        System.out.println("enter early arrival hour");
        double earlyHour = scanner.nextDouble();
        System.out.println("enter late arrival hour ");
        double lateHour = scanner.nextDouble();

        if (day > 8 || day < 0) {
            System.out.println("Illegal day");
            return;
        }
        if (day == 6 || day == 7) {
            System.out.println("On weekends the offices are closed");
            return;
        }
        if (earlyHour < 0 || lateHour > 23) {
            System.out.println("Illegal hour");
            return;
        }
        if (earlyHour > lateHour) {
            System.out.println("error");
            return;
        }
        if ((day == 1 || day == 2 || day == 4 || day == 5) && (earlyHour < 9 || lateHour > 17)) {
            System.out.println("The office is open from 9:00 to 17:00");
            return;
        }
        if ((day == 3 && earlyHour < 8 || lateHour > 12)) {
            System.out.println("The office is open from 8:00 to 12:00");
        } else System.out.println("Confirmation");

    }
}