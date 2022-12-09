package com.banigoden.atm.domain;

public enum Currencies {
    Dollar("$"), Euro("€"), Renminbi("CNY"), Bitcoin("BIT");

    private String currency;

    Currencies(String currency) {
        this.currency = currency;
    }
}
