package com.banigoden.atm.service.menu.Test;

public class Consumer implements Runnable{
    Q q;

    public Consumer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            q.get();
        }

    }
}
