// Create an abstract class shape and create TwoDim and ThreeDim as sub classes. 
// Create classes square and triangle derived from TwoDim and sphere and cube
// derived from ThreeDim. Write a program to determine the area of various shapes.

import java.util.*;


// Abstract class Shape with an abstract method calArea()
abstract class Shape {
    abstract double calArea();
}

// TwoDim class extending Shape
class TwoDim extends Shape {
    double calArea() {
        return 0; // Default implementation, overridden in subclasses
    }
}

// ThreeDim class extending Shape
class ThreeDim extends Shape {
    double calArea() {
        return 0; // Default implementation, overridden in subclasses
    }
}

// Square class extending TwoDim
class Square extends TwoDim {
    double side;

    Square(double a) {
        side = a;
    }

    // Implementing calArea() for Square
    double calArea() {
        return side * side;
    }
}

// Triangle class extending TwoDim
class Triangle extends TwoDim {
    double base, height;

    Triangle(double a, double b) {
        base = a;
        height = b;
    }

    // Implementing calArea() for Triangle
    double calArea() {
        return 0.5 * base * height;
    }
}

// Cube class extending ThreeDim
class Cube extends ThreeDim {
    double side;

    Cube(double a) {
        side = a;
    }

    // Implementing calArea() for Cube
    double calArea() {
        return 6 * side * side;
    }
}

// Sphere class extending ThreeDim
class Sphere extends ThreeDim {
    double radius;

    Sphere(double a) {
        radius = a;
    }

    // Implementing calArea() for Sphere
    double calArea() {
        return 4 * Math.PI * radius * radius;
    }
}

// Main class ShapeArea8
public class ShapeArea8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create objects for Square, Triangle, Cube, and Sphere
        Square square = new Square(sc.nextDouble());
        Triangle triangle = new Triangle(sc.nextDouble(), sc.nextDouble());
        Cube cube = new Cube(sc.nextDouble());
        Sphere sphere = new Sphere(sc.nextDouble());

        sc.close();

        // Print the areas of each shape
        System.out.println("Area of Square: " + square.calArea());
        System.out.println("Area of Triangle: " + triangle.calArea());
        System.out.println("Area of Cube: " + cube.calArea());
        System.out.println("Area of Sphere: " + sphere.calArea());
    }
}
