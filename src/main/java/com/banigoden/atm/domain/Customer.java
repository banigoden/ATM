package com.banigoden.atm.domain;

import com.banigoden.atm.domain.card.Card;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(of = {"card"})
@ConfigurationProperties(prefix = "client")
public class Customer {
    @Value("$(client.firstName)")
    private String firstName;
    @Value("$(client.secondName)")
    private String secondName;
    @Value("$(client.address)")
    private String address;
    @Value("$(client.dob)")
    private String dob; //Department of Bank
    @Value("$(client.customerID)")
    private long customerID;
    private Card card;
    private List<Card> cards;

    public void addCard(Card card) {
        cards.add(card);
    }

    public void deleteCard(Card card){
        cards.removeIf(card1 -> card1.equals(card));
    }

}
