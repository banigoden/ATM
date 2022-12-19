package com.banigoden.atm.domain;

import com.banigoden.atm.domain.card.Card;
import com.banigoden.atm.domain.card.PaymentSystems;
import lombok.Getter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@Getter
public class ApplicationProperties {
    private Properties properties;

    public ApplicationProperties(Properties properties) {
        this.properties = properties;
    }

    public AtmTypes getAtmType() {
        return AtmTypes.valueOf(properties.getProperty("model"));
    }

    public Card getCard(){
        Card card = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(properties.getProperty("pathToDb")))){
            List<String> lines = reader.lines().collect(Collectors.toList());
            for (String param : lines) {
                String[] line = param.split(", ");
               card = new Card(Long.valueOf(line[0]),
                        line[1], Integer.parseInt(line[2]),
                       PaymentSystems.valueOf(line[3].trim().toUpperCase(Locale.ROOT)),
                       line[4], Boolean.valueOf(line[5]), Integer.valueOf(line[6]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return card;
    }
}
