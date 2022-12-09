package com.banigoden.atm.service.menu.Test;

public class Producer implements Runnable{
   Q q;

    public Producer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            q.put(i);
        }
    }
}
