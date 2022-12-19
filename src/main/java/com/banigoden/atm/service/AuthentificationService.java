package com.banigoden.atm.service;

import com.banigoden.atm.domain.ApplicationProperties;
import com.banigoden.atm.service.atm.Atm;
import com.banigoden.atm.service.atm.AtmFactory;
import com.banigoden.atm.service.menu.Requester;
import com.banigoden.atm.domain.card.Card;

public class AuthentificationService {

    public  void validate(Card card) {
        int pin = Requester.requestInt("Enter PIN: ");
        boolean isFalse = false;
        boolean checkAttempts = false;
        while (card.getAttempt() > 0 && isFalse == false) {
            if (card.getPinCode() == pin) {
                isFalse = true;
            }else {
                card.setAttempt(card.getAttempt() - 1);
                System.out.printf("You have %d attempts. \n", card.getAttempt());
                if (card.getAttempt() == 0){
                    cardIsBlocked(card);
                    //change later
                    String path = "application.properties";
                    PropertiesService propertyService = new PropertiesFileServise();
                    ApplicationProperties applicationProperties = propertyService.load(path);
                    Atm atm = AtmFactory.getInstance().creatyAtm(applicationProperties);
                    atm.startServ();
                }else {
                    checkAttempts = true;
                    break;
                }
            }
        }
       if (checkAttempts == true){
           validate(card);
       }
    }

   public static void cardIsBlocked(Card card){
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
