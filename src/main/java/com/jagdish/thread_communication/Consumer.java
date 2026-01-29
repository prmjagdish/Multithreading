package com.jagdish.thread_communication;

public class Consumer implements Runnable {

    private final PizzaBuffer buffer;

    public Consumer(PizzaBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}