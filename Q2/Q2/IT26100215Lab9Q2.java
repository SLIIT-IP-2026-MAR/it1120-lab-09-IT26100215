import java.util.Scanner;

public class IT26100215Lab9Q2 {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = input.nextDouble();

		System.out.print("The area of the circle with radius " + r + " is = " + circleArea(r));    }
}