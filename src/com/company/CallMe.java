package com.company;

/**
 * Created by tscheys on 20/03/2017.
 */
public class CallMe {
    private String msg;

    void callme(String msg) {
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("]");
    }
 }
