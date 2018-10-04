import java.util.Scanner;

public class DisplayRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of rectangle: " + rectangle.getParimeter());
        System.out.println("Area of Rectangle: " + rectangle.getArea());

    }
}
