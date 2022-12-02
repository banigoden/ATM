package service;

import atm.menu.Requester;
import bank.card.Card;

public class AuthentificationService {

    public static void validate(Card card, int key) {
        int coutDown = 3;

        boolean isFalse = false;
        if (card.isBlocked() == true){
            isFalse = true;
            cardIsBlocked();
        }

        while (coutDown > 0 && isFalse == false) {
            if (card.getPinCode() == key) {
                isFalse = true;
            }else {
                coutDown--;
                System.out.printf("You have %d attempts.", coutDown);
                if (coutDown == 0){
                    cardIsBlocked();
                    card.setBlocked(true);
                }
                validate(card, Requester.requestInt("\nEnter PIN:"));
            }
        }
    }

   public static void cardIsBlocked(){
       System.out.println("Your card is blocked." +
               "Please call your bank.");

   }
}
