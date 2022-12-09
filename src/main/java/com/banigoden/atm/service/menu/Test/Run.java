package com.banigoden.atm.service.menu.Test;

public class Run {
    public static void main(String[] args) {
        Q q = new Q();
        new Thread(new Consumer(q), "Consumer").start();
        new Thread(new Producer(q), "Producer").start();
        System.out.println("To stop press CTRL - C");
    }
}
