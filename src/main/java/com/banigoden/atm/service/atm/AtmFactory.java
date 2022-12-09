package com.banigoden.atm.service.atm;

import com.banigoden.atm.domain.ApplicationProperties;
import com.banigoden.atm.domain.AtmTypes;

public class AtmFactory {
    public static AtmFactory getInstance() {
        return new AtmFactory();
    }

    public Atm createAtm(ApplicationProperties applicationProperties) {
        if (AtmTypes.T1000.equals(applicationProperties.getAtmType())){
            return new AtmVivi();
        }
        return null;
    }

}
