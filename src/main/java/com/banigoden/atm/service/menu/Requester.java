package com.banigoden.atm.service.menu;

import java.util.Scanner;

public class Requester implements AutoCloseable{
    private static Scanner scanner = new Scanner(System.in);;

    public static String requestLine(String requestMessage){
        String value = "";
        System.out.print(requestMessage);

        try {
            value = scanner.nextLine();
        }catch (Exception e){
            System.out.println("Please enter only words!");
        }
        return value;
    }
    public static int requestInt(String requestMessage){
        int value = 0;
        System.out.print(requestMessage);
        try {
            value = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Please enter only digits!");
        }
        return value;
    }

    @Override
    public void close() {
        scanner.close();
    }
}
