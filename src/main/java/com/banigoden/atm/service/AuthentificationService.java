package com.banigoden.atm.service;

import com.banigoden.atm.service.menu.Requester;
import com.banigoden.atm.service.menu.StartMenu;
import com.banigoden.atm.domain.card.Card;

public class AuthentificationService {

    public static void validate(Card card,int pin) {
        int coutDown = 3;

        boolean isFalse = false;
        if (card.isBlocked() == true){
            isFalse = true;
        }

        while (coutDown > 0 && isFalse == false) {
            if (card.getPinCode() == pin) {
                isFalse = true;
            }else {
                coutDown--;
                System.out.printf("You have %d attempts.", coutDown);
                if (coutDown == 0){
                    cardIsBlocked(card);
                    StartMenu.welcomeScreen();
                }else {
                    pin = Requester.requestInt("\nEnter PIN: ");
                }
            }
        }
    }

   public static void cardIsBlocked(Card card){
       System.out.println(" Your card is blocked. " +
               "Please call your bank.");
       card.setBlocked(true);
       System.out.println("Get your card.");
       try {
           Thread.sleep(500);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
}
