public class ShapeAreaCalculator {

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a square
    public static double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a circle
    public static double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle
    public static double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return -1; // Invalid case
    }

    public static void main(String[] args) {
        // Rectangle area
        double rectangleArea = calculateArea(5.0, 3.0);
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Square area
        double squareArea = calculateArea(4.0);
        System.out.println("Area of Square: " + squareArea);

        // Circle area
        double circleArea = calculateArea(3.0f);
        System.out.println("Area of Circle: " + circleArea);

        // Triangle area
        double triangleArea = calculateArea(6.0, 4.0, true);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}

