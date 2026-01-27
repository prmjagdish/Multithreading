package com.jagdish.thread_basics.thread_playground;

public class ThreadPlayground {
    static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new Worker(),"Worker " + i);
            threads[i].start();
        }

        // Main waits for all threads
        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Main thread finished. State: " + Thread.currentThread().getState());
    }
}
