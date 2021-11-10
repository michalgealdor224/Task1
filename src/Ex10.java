import java.util.Random;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(1000) + 1;
        int severalAttempts1 = 0;
        int severalAttempts2 = 0;
        do {
            System.out.println("player 1 enter number");
            int guess = scanner.nextInt();
            severalAttempts1 ++;
            if (guess != num) bigOrSmall(guess,num);
            else {
                System.out.println(" player 1 winner in " + severalAttempts1 + "  "+ "several attempts");
                break;
            }

            System.out.println("player 2 enter number");
            guess = scanner.nextInt();
            severalAttempts2 = severalAttempts2 + 1;
            if (guess != num)
                bigOrSmall(guess,num);
            else {
                System.out.println(" player 2 winner in " + severalAttempts2 + "  "+ "several attempts");
                break;
            }
        } while (true);

    }

    public static void bigOrSmall (int guess, int num) {
        if (guess < num)
            System.out.println("the guess is smaller");
        else System.out.println("the guess is bigger");
    }
}
