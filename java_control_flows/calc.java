import java.util.*;

public class calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to my calculator!");

        while (true) {
            System.out.println("Enter the operator (1 for +, 2 for -, 3 for *, 4 for /, 0 to exit):");
            int a = sc.nextInt();

            
            if (a == 0) {
                System.out.println("Thank you for using the calculator!");
                break;
            }

           
            if (a < 1 || a > 4) {
                System.out.println("Not a valid operator. Try again.");
                continue; 
            }

            System.out.println("Enter first number:");
            int x = sc.nextInt();
            System.out.println("Enter second number:");
            int y = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println( (x + y));
                    break;
                case 2:
                    System.out.println( (x - y));
                    break;
                case 3:
                    System.out.println((x * y));
                    break;
                case 4:
                    if (y == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                    } 
                    else if (x<y){
                        float r = (float)x/y;
                        System.out.println(r);
                    }
                    else {
                        System.out.println((x / y));
                    }
                    break;
            }
        }

    }
}
