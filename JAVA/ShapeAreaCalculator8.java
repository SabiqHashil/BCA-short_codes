// Create an abstract class shape and create TwoDim and ThreeDim as sub classes. 
// Create classes square and triangle derived from TwoDim and sphere and cube
// derived from ThreeDim. Write a program to determine the area of various shapes.

abstract class Shape {
    abstract double area();
}

class TwoDim extends Shape {
    @Override
    double area() {
        return 0; // Placeholder value
    }
}

class ThreeDim extends Shape {
    @Override
    double area() {
        return 0; // Placeholder value
    }
}

class Square extends TwoDim {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

class Triangle extends TwoDim {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Sphere extends ThreeDim {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 4 * Math.PI * radius * radius;
    }
}

class Cube extends ThreeDim {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return 6 * side * side;
    }
}

public class ShapeAreaCalculator8 {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(4.0, 3.0);
        Sphere sphere = new Sphere(2.0);
        Cube cube = new Cube(3.0);

        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Surface Area of Sphere: " + sphere.area());
        System.out.println("Surface Area of Cube: " + cube.area());
    }
}