package com.jagdish.phase1_thread_basics.thread_creation;

/*
* Represents only the task
* Execution is handled by a Thread
* */
public class MyTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Running task..");
    }
}
