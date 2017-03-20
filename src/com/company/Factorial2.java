package com.company;

/**
 * Created by tscheys on 18/03/2017.
 */
public class Factorial2 {
    long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
}
