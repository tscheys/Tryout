package com.company;

/**
 * Created by tscheys on 18/03/2017.
 */
abstract class Figure {
    protected double dimA;
    protected double dimB;

    Figure(double a, double b) {
        dimA = a;
        dimB = b;
    }

    abstract double area();
}
