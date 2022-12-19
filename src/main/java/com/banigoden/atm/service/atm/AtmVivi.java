package com.banigoden.atm.service.atm;

import com.banigoden.atm.domain.card.Card;
import com.banigoden.atm.service.AuthentificationService;
import com.banigoden.atm.service.CardVerificationServise;
import com.banigoden.atm.service.atm.Atm;
import com.banigoden.atm.service.menu.MenuRander;
import com.banigoden.atm.service.menu.StartMenu;

public class AtmVivi implements Atm {
    private String name;
    private Card card;

    public AtmVivi(String name, Card card) {
        this.name = name;
        this.card = card;
    }

    @Override
    public void startServ() {
        boolean fallenTestCard;
        StartMenu startMenu = new StartMenu(name);
        String cardName = startMenu.welcomeScreen();
        fallenTestCard = new CardVerificationServise().verify(cardName);
        AuthentificationService authentificationService = new AuthentificationService();
        int pin = authentificationService.askPin();
        authentificationService.checkAttempts(card,pin);
        MenuRander menuRander = new MenuRander();
        menuRander.render();

    }
}
