package com.company;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Random;

/**
 * Created by tscheys on 20/03/2017.
 */
public class NewThread implements Runnable {

    Thread t;
    private String name;

    NewThread(String name) {
        t = new Thread(this, name);
        this.name = name;
        System.out.println("started thread" + name);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("thread: " + name + " printing numeber: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("exception" + e);
        }
    }

}
