package com.learnjava.core;

/**
 * @author jaishishranjan
 * This class will extend to Thread class to introduce and run a thread.
 */
public class StartThread extends Thread{
    public void run() {
        System.out.println("I am in StartThread class.");
    }

    public static void main (String [] args) throws InterruptedException {
        StartThread startThread = new StartThread();
        /**
         * starting the thread of StartThread
         * Invoking Thread using start() method
         */
        startThread.start();
        //startThread.wait(10);
    }
}
