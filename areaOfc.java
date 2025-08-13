import java.util.Scanner;

public class areaOfc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Formula: Area = π × r²
        double area = Math.PI * radius * radius;

        // Output
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        sc.close();
    }
}
