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

public class Main {

    public static void main(String[] args) {


    }
}

