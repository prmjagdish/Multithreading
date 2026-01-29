package com.jagdish.phase3_thread_communication;

public class Producer implements Runnable {

    private final PizzaBuffer buffer;
    private int count = 0;

    public Producer(PizzaBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String pizza = "Pizza-" + (++count);
                buffer.produce(pizza);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
