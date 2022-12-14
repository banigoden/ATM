package com.banigoden.atm;

import com.banigoden.atm.domain.ApplicationProperties;
import com.banigoden.atm.service.*;
import com.banigoden.atm.service.atm.Atm;
import com.banigoden.atm.service.atm.AtmFactory;


public class Main {
    public static void main(String[] args) {
        String path = "application.properties";
        PropertiesService propertyService = new PropertiesFileServise();
        ApplicationProperties applicationProperties = propertyService.load(path);
        Atm atm = AtmFactory.getInstance().creatyAtm(applicationProperties);
        atm.startServ();
    }
}
