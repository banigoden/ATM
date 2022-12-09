package com.banigoden.atm.service.menu.Test;

public class A {
    synchronized void foo(B b){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("try to call a");
        b.last();
    }

    synchronized void last(){
        System.out.println("inside a");
    }

}
