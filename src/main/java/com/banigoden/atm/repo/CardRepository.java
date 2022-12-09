package com.banigoden.atm.repo;

import com.banigoden.atm.domain.card.Card;

import java.util.List;

public interface CardRepository {
    Card create();
    Card readByID();
    List<Card> readAll();
    void update(Card card);

}
