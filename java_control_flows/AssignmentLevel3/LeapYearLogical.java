import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else {
            if (year < 1582) {
                System.out.println("The year " + year + " is before the Gregorian calendar (1582). Not valid for Leap Year check.");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }
        }
    }
}
