package atm.menu;

import java.util.Scanner;

public class Requester implements AutoCloseable{
    private static Scanner scanner = new Scanner(System.in);;


    public static String requestLine(String requestMessage){
        System.out.print(requestMessage);
        return scanner.nextLine();
    }
    public static int requestInt(String requestMessage){
        System.out.print(requestMessage);
        return scanner.nextInt();
    }

    @Override
    public void close() {
        scanner.close();
    }
}
