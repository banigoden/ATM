package com.banigoden.atm.service;

import com.banigoden.atm.domain.ApplicationProperties;

public interface PropertiesService {

    ApplicationProperties load(String pathTo);
}
