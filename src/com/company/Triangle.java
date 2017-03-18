package com.company;

/**
 * Created by tscheys on 18/03/2017.
 */
class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);

    }

    double area() {
        return (dimA * dimB) / 2;
    }
}

