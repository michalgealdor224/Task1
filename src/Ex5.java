import java.util.Scanner;

public class Ex5 {

    public static int factory(int type, int numberHours, int numberOfDays) {
        int salary = 0;
        if (type == 0) {
            salary = 50 * numberHours + numberOfDays * 250;
            return salary;
        } else if (type == 1) {
            salary = 200 * numberHours + 250 * numberOfDays;
            return salary;
        }

        return salary;

    }

    public static void startAndAgain(){
        Scanner scanner = new Scanner(System.in);
        int type, again;
        do {
            System.out.println("enter 0 for junior or 1 for senior");
            type = scanner.nextInt();
        } while (type != 1 && type != 0);

        System.out.println("enter Number of working hours");
        int numberHours = scanner.nextInt();
        System.out.println("enter Number of days to reach the destination");
        int numberOfDays = scanner.nextInt();
        int sum = factory(type, numberHours, numberOfDays);
        System.out.println("the salary is:" + sum);
        System.out.println("to enter more worker press 1 ,to stop press 2");
        again = scanner.nextInt();
        switch (again){
            case 1:{
                startAndAgain();
            }
            case 2:{
                break;
            }
        }

    }

    public static void main(String[] args) {
        startAndAgain();
    }

}

