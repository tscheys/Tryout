package com.company;


class Factorial {

    private int test = 3;
    static int factorial(int number) {
        int[] arr = {4,6,3};
        int[] arr2 = {4,6,3};
        if(arr.equals(arr2)) {

        }

        if(number == 0) return 1;
        return factorial(number - 1) * number;
    }

    class Inner {
        int a = test;

    }

    Inner i = new Inner();
}



class Stack {

    private Integer[] stck;
    private int currentTop;

    //construct stack
    Stack(int stackSize) {
        stck = new Integer[stackSize];
        currentTop = -1;
    }

    //add values to stack
    void push(int newValue) {
        if (stck.length-1 == currentTop) System.out.println("Stack is full");
        else stck[++currentTop] = newValue;
    }

    int pop() {

        if (currentTop < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stck[currentTop--];
        }
    }

    int StackSize() {
        // return the number of values in the stack
        return currentTop + 1;
    }

    void printStack() {
        for(Integer value : stck) {
            if(value != null )System.out.print(value + " ");
        }
        System.out.println("");
    }

}

class Box {
    int width;
    int length;
    int depth;

    void volume(int a) {
        System.out.print("test");
    }

    int volume(int a, double b) {
        return a;
    }

    int volume() {
        return this.width * this.length * this.depth;
    }

    void setDim(int w,int l,int d) {
        width = w;
        length = l;
        depth = d;
        Integer[] arr = new Integer[10];
        arr[4] = null;
    }



 }

// add inheritance tryout code
class A {
    private int a = 5; // only accessible to class A, noting else
    protected int c = 3; // accessible to itself, subclasses and the package
    public int b = 4; // accessible to itself, subclasses, the package and the world
    int d = 3; // accessible only to itself and its package
}

class B extends A {
    public int a = 5;
}

public class Main {

    public static void main(String[] args) {

        B b = new B();
        int dd = b.c;


        // try out this shit
        int a = 5;
        Factorial f = new Factorial();
        System.out.println(f.factorial(50));


        // try out stack class

        Stack st1 = new Stack(8);
        Stack st2 = new Stack(8);
        //System.out.print(st1.equalTo(st2));

        st1.push(5);
        st1.printStack();
        st1.push(3);
        st1.printStack();
        st1.push(2);
        st1.printStack();
        System.out.println(st1.pop());
        st1.printStack();
        System.out.println(st1.pop());
        st1.printStack();
        st1.pop();
        st1.pop();
        st1.pop();
        st1.push(3);
        st1.printStack();
        st1.push(3);
        st1.printStack();





	// write your code here
        Tuple[] customerLocations = {new Tuple(3,4), new Tuple(4,5), new Tuple(1,3)};
        distanceMatrix(customerLocations);
        // declare variables
        Box box1 = new Box();
        Box box2 = box1;

        Factorial.factorial(5);

        box2.width = 1;
        box2.length = 1;
        box2.depth = 1;

        // assign variables
        box1.depth = 5;
        box1.length = 10;
        box1.width = 3;

        int vol = box1.volume();

        System.out.println("Box1 and 2 are equal is " + box1.equals(box2));

        System.out.print("Box 1 and 2 will always have the same dimensions" + box1.depth + " " + box1.length + " " + box1.width);
        System.out.print("Box 1 and 2 will always have the same dimensions" + box2.depth + " " + box2.length + " " + box2.width);

        //int vol = box1.depth * box1.length * box1.width;
        //System.out.print(vol);
    }




    static Integer[][] distanceMatrix(Tuple[] customerLocations) {
        Integer[][] mat = new Integer[customerLocations.length][customerLocations.length];
        for(int i = 0; i < customerLocations.length; i++) {
            for(int j = 0; j < customerLocations.length; j++) {

                // calculate Manhatten distance
                int yDirectionDistance = Math.abs(customerLocations[i].y - customerLocations[j].y);
                int xDirectionDistance = Math.abs(customerLocations[i].x - customerLocations[j].x);
                mat[i][j] = yDirectionDistance + xDirectionDistance;
                System.out.println("this code works");

                int test = 0;
                //boolean test2 = (boolean) test;

                int[] arr  = {3,5,6,7};
                int arr2[]  = {3,5,6,7};
                int[] arr3;
                arr3 = new int[20];
            }
        }
        return mat;
    }
}
