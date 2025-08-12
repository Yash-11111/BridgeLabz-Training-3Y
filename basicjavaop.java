import java.util.*;

public class basicjavaop {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        // Addition

        // int a = 5;
        // int b=10;
        System.out.println("Addition : "+(a+b));



        // substraction

        System.out.println("Substraction : "+(b-a));

        // multiplication
        System.out.println("multiplication : "+(a*b));

        // division
        if(b==0) System.out.println("Division is not possible");

        System.out.println("division : " +(a/b));
        

        sc.close();
        
    }


}