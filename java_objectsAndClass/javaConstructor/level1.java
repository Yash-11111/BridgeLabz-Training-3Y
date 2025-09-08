

import java.util.Scanner;

public class level2 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Level 2 Programs Menu =====");
        System.out.println("1. Book (Default + Parameterized)");
        System.out.println("2. Circle (Constructor Chaining)");
        System.out.println("3. Person (Copy Constructor)");
        System.out.println("4. Hotel Booking System");
        System.out.println("5. Library Book System");
        System.out.println("6. Car Rental System");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Book b1 = new Book();
                Book b2 = new Book("Wings of Fire", "A.P.J Abdul Kalam", 250.0);
                b1.displayBook();
                b2.displayBook();
                break;

            case 2:
                Circle c1 = new Circle();
                Circle c2 = new Circle(5.5);
                c1.displayCircle();
                c2.displayCircle();
                break;

            case 3:
                Person p1 = new Person("Ravi", 25);
                Person p2 = new Person(p1);
                p1.displayPerson();
                p2.displayPerson();
                break;

            case 4:
                HotelBooking h1 = new HotelBooking();
                HotelBooking h2 = new HotelBooking("Rahul", "Deluxe", 3);
                HotelBooking h3 = new HotelBooking(h2);
                h1.displayBooking();
                h2.displayBooking();
                h3.displayBooking();
                break;

            case 5:
                LibraryBook book1 = new LibraryBook("Mahabharata", "Vyasa", 500);
                book1.displayBook();
                book1.borrowBook();
                book1.borrowBook();
                break;

            case 6:
                CarRental rental = new CarRental("Sita", "Swift", 5);
                rental.displayRental();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }


class Book {
    String title;
    String author;
    double price;

    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }

    void displayCircle() {
        System.out.println("Circle Radius: " + radius);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        this("Unknown", "Standard", 1);
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void displayBooking() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}

class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author +
                ", Price: " + price + ", Available: " + isAvailable);
    }
}

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000.0;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void displayRental() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
                ", Days: " + rentalDays + ", Total: " + calculateTotalCost());
    }
}
