package atm.menu;

public interface MainScreen {

    default void Screen(){
        System.out.println("1 Deposit\t" + "3 Balance inquiry\n" +  "2 Withdrow\t" + "4 Transfer & Payments\n"
        + "5 Return card\t" + "6 ");
    }
}
