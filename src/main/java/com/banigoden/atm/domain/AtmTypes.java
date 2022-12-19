package com.banigoden.atm.domain;



public enum AtmTypes {
    T1000("T1000"), T2000("T2000") , T3000("T3000");

    private String name;

    AtmTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
