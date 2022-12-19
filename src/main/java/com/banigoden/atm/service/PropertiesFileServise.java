package com.banigoden.atm.service;

import com.banigoden.atm.domain.ApplicationProperties;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileServise implements PropertiesService {

    @Override
    public ApplicationProperties load(String pathTo) {
       Properties properties = new Properties();
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream(pathTo)) {
            properties.load(is);
        } catch (IOException e) {

            e.printStackTrace();
        }
        return new ApplicationProperties(properties);
    }


}
