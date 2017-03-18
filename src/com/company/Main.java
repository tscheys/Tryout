package com.company;

abstract class Figure {
    protected double dimA;
    protected double dimB;

    Figure(double a, double b) {
        dimA = a;
        dimB = b;
    }

    abstract double area();
}

class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);

    }

    double area() {
        return (dimA * dimB) / 2;
    }
}

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);

    }

    double area() {
        return dimA * dimB;
    }
}



public class Main {

    public static void main(String[] args) {
        // define super and subclass instances
        Figure f = new Figure(3, 4);
        Rectangle r = new Rectangle(2,8);
        Triangle t = new Triangle(2, 1);

        // check functioning of area method
        System.out.println("Area of figure is " + f.area());
        System.out.println("Area of rectangle is" + r.area());

        // check polymorphism
        f = r;
        System.out.println("area method called on figure which references rectangle subclass " + f.area());

        f = t;
        System.out.println("area method called on figure which references trianglesubclass " + f.area());



    }
}

