package atm.menu;

public interface StartMenu {

    default void welcomeScreen(){
        System.out.println("Welcome!" +
                "Please insert the card.");
    }

    default void pleaseWait(){
        System.out.println("Please wait!");
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    default void enterPIN(){
        System.out.print("Enter PIN: ");

    }

}
