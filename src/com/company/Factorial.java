package com.company;

/**
 * Created by tscheys on 18/03/2017.
 */
import java.util.HashMap;

public class Factorial {
    // implement memoized version of factorial
    private HashMap<Integer, Long> lookup = new HashMap();

    long factorial(int n) {
        if(n == 0) {
            return 1;
        } else if(lookup.containsKey(n)) {
            return lookup.get(n);
        } else {
            long f = factorial(n - 1) * n;
            lookup.put(n, f);
            return f;
        }
    }
}


