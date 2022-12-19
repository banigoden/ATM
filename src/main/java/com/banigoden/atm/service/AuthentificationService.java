package com.banigoden.atm.service;

import com.banigoden.atm.service.menu.Requester;
import com.banigoden.atm.domain.card.Card;

public class AuthentificationService {

    public boolean validate(Card card, int pin) {
            if (card.getPinCode() == pin)
                 return true;
            else return false;
    }

    public void checkAttempts(Card card, int pin){
        if (card.getBlock() == false){
            while(card.getAttempt() > 0) {
                boolean checkAttempts = validate(card, pin);
                if (checkAttempts == true){
                    System.out.println("PIN is correct.");
                    break;
                }else {
                    System.out.println("PIN isn't correct.");
                    card.setAttempt(card.getAttempt() - 1);
                    System.out.printf("You have %d attempts. \n", card.getAttempt());
                    if (card.getAttempt() == 0) {
                        cardIsBlocked(card);
                        break;
                    }
                    checkAttempts(card,askPin());
                }
            }
        }else {
            cardIsBlocked(card);
        }
    }

    public int askPin(){
        return Requester.requestInt("Enter PIN: ");
    }

   public void cardIsBlocked(Card card){

       System.out.println(" Your card is blocked. " +
               "Please call your bank.");
       card.setBlock(true);
       System.out.println("Get your card.");
       try {
           Thread.sleep(500);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
}
