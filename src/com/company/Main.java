package com.company;
import java.lang.*;


public class Main {

    public static void main(String[] args) {
        CallMe c1 = new CallMe();
        NewThread t1 = new NewThread(c1, "Hello");
        NewThread t2 = new NewThread(c1, "Synchronized");
        NewThread t3 = new NewThread(c1, "World");
    }
}

