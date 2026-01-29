package com.jagdish.phase3_thread_communication;

import java.util.LinkedList;
import java.util.Queue;

public class PizzaBuffer {

    private final Queue<String> buffer = new LinkedList<>();
    private final int capacity;

    public PizzaBuffer(int capacity){
        this.capacity = capacity;
    }

    public synchronized void produce(String pizza) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // buffer full
        }

        buffer.add(pizza);
        System.out.println("🍕 Produced: " + Thread.currentThread() + pizza);

        notifyAll(); // notify consumers
    }


    public synchronized String consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // buffer empty
        }

        String pizza = buffer.poll();
        System.out.println("😋 Consumed: " + Thread.currentThread() + pizza);

        notifyAll(); // notify producers
        return pizza;
    }

}
