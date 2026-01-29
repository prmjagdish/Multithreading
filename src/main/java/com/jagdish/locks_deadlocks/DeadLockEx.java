package com.jagdish.locks_deadlocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLockEx {

    public static void main(String[] args) {
        Account a = new Account(1000);
        Account b = new Account(1000);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> Bank.transfer(a, b, 100));
        executor.submit(() -> Bank.transfer(b, a, 100));

        executor.shutdown();
    }
}
