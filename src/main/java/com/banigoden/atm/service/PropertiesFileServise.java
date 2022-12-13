package com.banigoden.atm.service;

import com.banigoden.atm.domain.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.io.ClassPathResource;


@Configuration
@PropertySources({
        @PropertySource("classpath:application.cards.properties"),
        @PropertySource("classpath:application.client.properties")
})
public class PropertiesFileServise implements PropertiesService {


    @Bean
    @Override
    public ApplicationProperties load(String pathTo) {
        ApplicationProperties applicationProperties = new ApplicationProperties();
        ClassPathResource[] resource = new ClassPathResource[]
                {new ClassPathResource(pathTo) };

        return applicationProperties;
    }
}
