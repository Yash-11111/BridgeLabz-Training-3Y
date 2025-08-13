import java.util.Scanner;

public class addtwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Addition
        int sum = num1 + num2;

        // Output
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
