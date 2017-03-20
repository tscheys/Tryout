package com.company;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.Random;
import java.util.StringJoiner;

/**
 * Created by tscheys on 20/03/2017.
 */
public class NewThread extends Thread {

    Thread t;
    private String name;
    private CallMe target;
    private String msg;

    NewThread(CallMe obj, String msg) {
        t = new Thread(this);
        this.msg = msg;
        target = obj;

        System.out.println("started thread" + name);
        t.start();
    }

    public void run() {
        synchronized (target) {
            target.callme(msg);
        }
        /*try {
            for (int i = 0; i < 5; i++) {
                System.out.println("thread: " + name + " printing numeber: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("exception" + e);
        }*/
    }

}
