import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1 number");
        int num1 = scanner.nextInt();
        System.out.println("enter more number");
        int num2 = scanner.nextInt();
        System.out.println("enter more number");
        int num3 = scanner.nextInt();
        int min;
        int mid;
        int max;
        int sum;
        max = Math.max(num1, num2);
        max = Math.max(max, num3);
        min = Math.min(num1, num2);
        min = Math.min(min, num3);
        sum = num1 + num2 + num3;
        mid = sum - max - min;
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);


    }

}


