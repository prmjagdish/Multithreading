package com.jagdish.thread_basics.thread_playground;

public class Worker implements Runnable{

    @Override
    public void run() {

        Thread current = Thread.currentThread();

        System.out.println("Running: " + current.getName() + " | State: " + current.getState());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Finished: " + current.getName() + " | State: " + current.getState());
    }
}
