package com.company;

/**
 * Created by tscheys on 20/03/2017.
 */
public class Exception {

    void operation() {
        try {
            int d = 5;
            int r = 0;
            int l = d / r; // will throw exception
        } catch(ArithmeticException e) {
            System.out.println("error: " +  e.toString());
        }
    }
}
