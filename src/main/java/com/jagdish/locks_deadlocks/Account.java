package com.jagdish.locks_deadlocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    int balance;
    final Lock lock = new ReentrantLock();

    public Account(int balance) {
        this.balance = balance;
    }

    void withdraw(int amount){
        balance -= amount;
    }

    void addBalance(int amount){
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
