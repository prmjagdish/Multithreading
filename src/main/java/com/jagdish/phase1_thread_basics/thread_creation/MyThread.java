package com.jagdish.phase1_thread_basics.thread_creation;

/*
* Represents both the task and the execution
* You extend Thread and override run()
* */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Running thread");
    }
}
