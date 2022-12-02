package atm.menu;

import bank.card.Card;
import service.AuthentificationService;
import service.CardVerificationServise;

public class StartMenu {

    public void welcomeScreen(){
        System.out.println("Welcome!"
                + "Please insert the card.");
       String card = Requester.requestLine("Enter card : ");
       CardVerificationServise.verify(card);
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

     public void enterPIN(Card card){
         int pin =Requester.requestInt("Enter PIN: ");
         AuthentificationService.validate(card, pin);

    }


}
