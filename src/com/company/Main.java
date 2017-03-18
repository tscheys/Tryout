package com.company;

class Box {
    private double width;
    private double length;
    private double depth;

    Box() {
        width = -1;
        length = -1;
        depth = -1;
    }

    Box(double w, double l, double d) {
        width = w;
        length = l;
        depth = d;
    }

    Box(double len) {
        width = length = depth = len;
    }

    Box(Box ob) {
        width = ob.width;
        length = ob.length;
        depth = ob.depth;
    }

    double volume() {
        return width * length * depth;
    }

 }

 class Boxweight extends Box {
    private double weight;

    Boxweight(Boxweight ob) {
        // make copy of Boxweight object
        super(ob);
        weight = ob.weight;

    }

    Boxweight(double w, double l, double d, double m) {
        super(w, l, d);
        weight = m;
    }

    Boxweight() {
        super();
    }
 }

class BoxColor extends Box{
    private String color;

    BoxColor() {
        super();
        color = "transparent";
    }

    BoxColor(String col) {
        color = col;
    }

}

class BoxTexture extends BoxColor{
    private String texture;

    BoxTexture() {
        super();
        texture = "default";

    }
}

public class Main {

    public static void main(String[] args) {
        Box b1 = new Box();
        Boxweight b2 = new Boxweight();
        //b2 = b1;
        // b1 = b2;


    }
}

