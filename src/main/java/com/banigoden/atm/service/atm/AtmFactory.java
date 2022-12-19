package com.banigoden.atm.service.atm;

import com.banigoden.atm.domain.ApplicationProperties;
import com.banigoden.atm.domain.AtmTypes;

public class AtmFactory {
    public static AtmFactory getInstance() {
        return new AtmFactory();
    }

    public Atm creatyAtm(ApplicationProperties applicationProperties) {
        if (AtmTypes.T1000.equals(applicationProperties.getAtmType())){
            return new AtmVivi(applicationProperties.getProperties().getProperty("owner"), applicationProperties.getCard());
        }
        else if (AtmTypes.T2000.equals(applicationProperties.getAtmType())){
            return new AtmVivi(applicationProperties.getProperties().getProperty("owner"), applicationProperties.getCard());
        }
        else if (AtmTypes.T3000.equals(applicationProperties.getAtmType())){
            return new AtmVivi(applicationProperties.getProperties().getProperty("owner"), applicationProperties.getCard());
        }
        return null;
    }
}
