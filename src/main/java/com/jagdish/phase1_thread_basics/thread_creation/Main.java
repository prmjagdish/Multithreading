package com.jagdish.phase1_thread_basics.thread_creation;

public class Main {
    static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        //Execution is handled by a Thread
        Thread t2 = new Thread(new MyTask(),"t2");
        t2.start();
    }
}

