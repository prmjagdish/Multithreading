package com.jagdish.locks_deadlocks;

class Bank {

    static void transfer(Account from, Account to, int amount) {
        from.lock.lock();
        try {
            to.lock.lock();
            try {
                from.withdraw(amount);
                to.addBalance(amount);
            } finally {
                to.lock.unlock();
            }
        } finally {
            from.lock.unlock();
        }
    }
}
