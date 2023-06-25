import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double width;
    double height;

    do {
        System.out.print("Enter the width of the rectangle: ");
        if (scanner.hasNextDouble()) {
            width = scanner.nextDouble();
            break;
        } else {
            System.out.println("Invalid input. Please enter a valid numeric value.");
            scanner.nextLine();
        }
    } while (true);

    do {
        System.out.print("Enter the height of the rectangle: ");
        if (scanner.hasNextDouble()) {
            height = scanner.nextDouble();
            break;
    } else {
            System.out.println("Invalid input. Please enter a valid numeric value.");
            scanner.nextLine();
        }
    } while (true);

    double area = width * height;
    double perimeter = 2 * (width + height);
    double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

    System.out.println("Area of the rectangle: " + area);
    System.out.println("Perimeter of the rectangle: " + perimeter);
    System.out.println("Length of the diagonal: " + diagonal);

    }
}