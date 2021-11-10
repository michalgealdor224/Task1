import java.util.Scanner;

public class Ex8 {

    public static void main (String[] args){
        int number = numberReception();
        stellarTriangle(number);

    }
    public static int numberReception() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter number between 5 to 20");
            number = scanner.nextInt();
        }
        while (number < 4 || number > 21);

        return number;}



    public static void stellarTriangle(int number){

        for (int i = 0; i < number; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print('*'+ " ");

            }
            System.out.println( "*" + "");

        }

    }
}
