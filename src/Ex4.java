import java.util.Scanner;

public class Ex4 {

    static Scanner scanner=new Scanner(System.in);
    public static void main(String[]args) {
        double a, b, c, root, result1,result2;
        System.out.println("enter a");
        a = scanner.nextDouble();
        System.out.println("enter b");
        b = scanner.nextDouble();
        System.out.println("enter c");
        c = scanner.nextDouble();
        root = ((b * b) - 4 * a * c);
        root =Math.sqrt(root);
        result1 =(-b + root ) / 2*a;
        result2 = (-b - root) / 2*a;
        if (root > 0 )

            System.out.println("have 2 results" + " x1 =" + result1 + "  " +
                    "x2 = " + result2);

        else if (root == 0)

            System.out.println( " have one result " + "x1 =" + result1 );

        else
            System.out.println("there is no results");

    }
}
