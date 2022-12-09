package com.banigoden.atm.service.menu.Test;

public class DeadLock implements Runnable{
    A a = new A();
    B b = new B();
    Thread thread;

    public DeadLock() {
        thread = new Thread(this);
    }

    public void startDeadLock(){
        thread.start();
        a.foo(b);
    }
    @Override
    public void run(){
        b.bar(a);
    }

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        deadLock.startDeadLock();

    }

    public static Thread creatorThread(){
        Thread thread = new Thread();
        thread.start();
        return thread;
    }
}
