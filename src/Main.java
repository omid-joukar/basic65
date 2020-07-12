import java.util.Scanner;

/**
 * Created by KPS on 7/12/2020.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        int divided = a / b;
        int result = a - (divided * b);
        System.out.println(result);
    }
}
