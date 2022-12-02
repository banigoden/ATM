package customer;

import atm.menu.MenuRander;
import atm.menu.StartMenu;
import bank.card.Card;
import bank.card.PaymentSystem;

import java.util.List;

public class Client extends Customer{


    public Client(String firstName, String secondName, String address, String dob, long customerID, Card cards) {
        super(firstName, secondName, address, dob, customerID, cards);
    }

    public static void main(String[] args) {
        Card cardsPaul = new Card(442323232, "Paul Shobatskiy", 3412, PaymentSystem.Visa);

        Client paul = new Client("Paul", "Shobatskiy",
                "Germany, Berlin, Shvarts 2","Departure 2",22142, cardsPaul);
        StartMenu startMenu = new StartMenu();
        startMenu.welcomeScreen();
        startMenu.enterPIN(cardsPaul);
    }
}
