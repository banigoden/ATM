package service;

import bank.card.PaymentSystem;

import java.util.Arrays;

public class SessionService {

    public void start(PaymentSystem paymentSystem){
        int [] array = {4,52,6,67,3,2,11};

        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left -1;
            for (; i >=0 ; i--) {
                if (value < array[i]){
                    array[i + 1] = array[i];
                }else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));

    }

    public void stop(Session session){

    }

    public void reject(Session session){

    }

    public void handle(Session session){

    }
}
