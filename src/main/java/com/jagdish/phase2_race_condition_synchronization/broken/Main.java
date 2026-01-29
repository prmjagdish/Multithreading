package com.jagdish.phase2_race_condition_synchronization.broken;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                account.deposit(1);
            }
        }, "Depositor");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                account.withdraw(1);
            }
        }, "Withdrawer");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final balance: " + account.getBalance());
    }
}