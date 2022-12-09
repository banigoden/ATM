package com.banigoden.atm.service.menu.Test;

import java.util.concurrent.Semaphore;

public class Q {
    int n;
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semPro = new Semaphore(1);


     void get() {
        try{
            semCon.acquire();

        }catch (InterruptedException e){
            System.out.println();
        }
        System.out.println("Got " + n);
        semPro.release();

    }

     void put(int n) {
        try{
            semPro.acquire();
        }catch (InterruptedException e){
            System.out.println();
        }
        this.n = n;
        System.out.println("Put " + n);
        semCon.release();
    }
}
