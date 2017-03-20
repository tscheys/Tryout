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
        System.out.println("Area or surface of figure is " + f.area());
        System.out.println("Area or surface of rectangle is" + r.area());

        // check polymorphism
        f = r;
        System.out.println("area or surface method called on figure which references rectangle subclass " + f.area());

        f = t;
        System.out.println("area or surface method called on figure which references trianglesubclass " + f.area());


        Figure f2;

        f2 = r;
        f2.area();

        Factorial memo = new Factorial();
        Factorial2 nonmemo = new Factorial2();

/*        long startTime = System.currentTimeMillis();
        long result1 = memo.factorial(40);
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time of memoized version first run: " + (endTime-startTime) + "ms" + " result: " + result1);

        long startTime3 = System.currentTimeMillis();*/
//        long result3 = memo.factorial(40);
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("Total execution time of memoized version second run: " + (endTime3-startTime3) + "ms" + " result: " + result3);


/*        long startTime1 = System.currentTimeMillis();
        long result2 = nonmemo.factorial(40);*/
        /**/long endTime1 = System.currentTimeMillis();
//        System.out.println("Total execution time of non-memoized version: " + (endTime1-startTime1) + "ms" + " result: " + result2);



    }
}

