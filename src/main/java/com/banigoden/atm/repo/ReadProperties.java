package com.banigoden.atm.repo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadProperties {

    private ReadProperties(){
    }
    public static String getSingeltonReader(String path){
        String result = "";
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            Stream<String> allLines = reader.lines();
             result = allLines.collect(Collectors.joining());
        }catch (IOException e){
            e.printStackTrace();
        }
        
        return result;
    }
}
