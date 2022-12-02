package atm.menu;

import java.io.Reader;
import java.util.Scanner;

public class MenuRander {

    public static void menu(){
        System.out.println("1 Deposit\t" + "3 Balance inquiry\n" +  "2 Withdrow\t" + "4 Transfer & Payments\n"
        + "5 Return card\t");
        render();
    }

    public static void render(){
        int input = Requester.requestInt("Please enter the number ");
            switch (input) {
                case 1 -> System.out.println("Deposit");
                case 2 -> System.out.println("Withdrow");
                case 3 -> System.out.println("Balance inquiry");
                case 4 -> System.out.println("Transfer & Payments");
                case 5 -> System.out.println("Return card");
                default -> System.out.println("Not right number");
            }
    }
}
