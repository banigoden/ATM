package atm.menu;

import service.CardVerificationServise;

public class StartMenu {

     void welcomeScreen(){
        System.out.println("Welcome!"
                + "Please insert the card.");
       String card = Requester.requestLine("Enter card : ");
       CardVerificationServise.verify(card);
    }

     void pleaseWait(){
        System.out.println("Please wait!");
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

     void enterPIN(){
         int pin = Requester.requestInt("Enter PIN: ");

    }

}
