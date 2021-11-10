import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int intNumber = positiveNumber();
        for (int i =2; i < intNumber; i ++)
        {
            if (primeNumber(i))
            {
                System.out.println(i);
            }

        }
    }
    public static boolean primeNumber(int num3) {

        for (int i = 2; i < num3; i++){
            if(division(num3, i)) {
                return  false;
            }

        }
        return true;
    }

    public static boolean division(int num1, int num2) {

        return (num1 % num2 == 0);
    }




    public static int positiveNumber() {
        {
            int num4;
            Scanner scanner = new Scanner(System.in);
            do{
                System.out.println("enter int number");
                num4 = scanner.nextInt();
            }while (num4 <= 0);


            return num4;
        }

    }

}