package com.banigoden.atm.service.menu.Test;

public class B {
    synchronized void bar(A a){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("try to call a");
        a.last();
    }
    synchronized void last() {
        System.out.println("inside b");
    }
}