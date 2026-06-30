public class IT26100215Lab9Q3 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {

        int ans1 = square(add(multiply(3,4), multiply(5,7)));

        int ans2 = add(square(add(4,7)), square(add(8,3)));

        System.out.println("Result of (3*4 + 5*7)^2 = " + ans1);
        System.out.println("Result of (4+7)^2 + (8+3)^2 = " + ans2);
    }
}