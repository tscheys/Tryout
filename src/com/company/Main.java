package com.company;

public class Main {

    public static void main(String[] args) {
        // define super and subclass instances
        Figure f;
        Rectangle r = new Rectangle(2,8);
        Triangle t = new Triangle(2, 1);
        f = t;

        // getclass refers to the reference and not to the type of the variable holding it.
        System.out.println("class of f Figure" + f.getClass());

        System.out.println(f.toString());

        System.out.println(f.hashCode());



        // check functioning of area method
        System.out.println("Area of figure is " + f.area());
        System.out.println("Area of rectangle is" + r.area());

        // check polymorphism
        f = r;
        System.out.println("area method called on figure which references rectangle subclass " + f.area());

        f = t;
        System.out.println("area method called on figure which references trianglesubclass " + f.area());


        Figure f2;

        f2 = r;
        f2.area();



    }
}

