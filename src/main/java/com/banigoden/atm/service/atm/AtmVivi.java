package com.banigoden.atm.service.atm;

import com.banigoden.atm.domain.card.Card;
import com.banigoden.atm.service.AuthentificationService;
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
        StartMenu startMenu = new StartMenu(name);
        startMenu.welcomeScreen();
        AuthentificationService authentificationService = new AuthentificationService();
        authentificationService.validate(card);
        MenuRander menuRander = new MenuRander();
        menuRander.render();

    }
}
