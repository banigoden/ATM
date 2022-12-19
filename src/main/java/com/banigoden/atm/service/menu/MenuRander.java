package com.banigoden.atm.service.menu;

public class MenuRander {
    public void render(){
        System.out.println("1 Deposit\t\t" + "3 Balance inquiry\n" +  "2 Withdrow\t\t" + "4 Transfer & Payments\n"
                + "5 Return card\t\t");
        int input = Requester.requestInt("Please enter the number: ");
        switch (input) {
                case 1 -> System.out.println("Deposit");
                case 2 -> System.out.println("Withdrow");
                case 3 -> System.out.println("Balance inquiry");
                case 4 -> System.out.println("help");
                case 5 -> System.out.println("Exit");
                default -> System.out.println("");
            }
    }
}
