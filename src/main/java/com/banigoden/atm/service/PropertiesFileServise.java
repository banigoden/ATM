package com.banigoden.atm.service;

import com.banigoden.atm.domain.ApplicationProperties;
import com.banigoden.atm.service.menu.Test.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@Configuration
@PropertySources({
        @PropertySource("classpath:application-card.properties"),
        @PropertySource("classpath:application-client.properties")
})
public class PropertiesFileServise implements PropertiesService {


    @Bean
    public static PropertySourcesPlaceholderConfigurer load() {
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        Resource[] resource = new ClassPathResource[]
                {new ClassPathResource("application-card.properties") };
        pspc.setLocations(resource);
        pspc.setIgnoreUnresolvablePlaceholders(true);
        return pspc;
    }

    @Override
    public ApplicationProperties load(String pathTo) {
        return new ApplicationProperties();
    }
}
