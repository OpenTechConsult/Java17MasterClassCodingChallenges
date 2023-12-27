public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println("The area of a circle with radius of 20.0 is " + area(20.0));
        System.out.println("The area of a rectangle with a length of 10.0" +
                " and a width of 5.0 is " + area(10.0d, 5.0d));
    }

    public static double area(double radius) {

        // double pi = 3.1415929d;

        if (radius < 0.0) {
            return -1.0d;
        }

        return Math.PI * (radius * radius);
    }

    public static double area(double x, double y) {

        if (x < 0.0 || y < 0.0) {
            return -1.0d;
        }

        return x * y;
    }
}
