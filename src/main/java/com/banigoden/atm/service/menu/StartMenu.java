package com.banigoden.atm.service.menu;

import com.banigoden.atm.domain.card.Card;
import com.banigoden.atm.service.AuthentificationService;
import com.banigoden.atm.service.CardVerificationServise;

public class StartMenu {
    private String name;

    public StartMenu(String name) {
        this.name = name;
    }

    public  void welcomeScreen(){
        System.out.println("Welcome to the " + name
                + " Please insert the card.");
       String card = Requester.requestLine("Enter card : ");
       new CardVerificationServise().verify(card);
       pleaseWait();
    }

     public void pleaseWait(){
        System.out.println("Please wait!");
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
