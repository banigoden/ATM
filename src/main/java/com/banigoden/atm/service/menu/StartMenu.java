package com.banigoden.atm.service.menu;

import com.banigoden.atm.domain.card.Card;
import com.banigoden.atm.service.AuthentificationService;
import com.banigoden.atm.service.CardVerificationServise;

public class StartMenu {

    public static void welcomeScreen(){
        System.out.println("Welcome!"
                + "Please insert the card.");
       String card = Requester.requestLine("Enter card : ");
       CardVerificationServise.verify(card);
       pleaseWait();
      // enterPIN();
    }

     public static void pleaseWait(){
        System.out.println("Please wait!");
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

     public static void enterPIN(Card card){
         int pin =Requester.requestInt("Enter PIN: ");
         AuthentificationService.validate(card, pin);

    }


}
