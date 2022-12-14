package com.banigoden.atm.service;

import com.banigoden.atm.domain.ApplicationProperties;
import com.banigoden.atm.service.menu.Test.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@Configuration
public class PropertiesFileServise implements PropertiesService {
   private static PropertiesFileServise singeltonInstance;
   private ApplicationProperties applicationProperties;


   public static synchronized PropertiesFileServise getInstance(){
       if (singeltonInstance == null){
           singeltonInstance = new PropertiesFileServise();
       }
       return singeltonInstance;
   }

    @Bean
    public static PropertySourcesPlaceholderConfigurer load() {
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        Resource[] resource = new ClassPathResource[]
                {new ClassPathResource("application.properties") };
        pspc.setLocations(resource);
        pspc.setIgnoreUnresolvablePlaceholders(true);
        return pspc;
    }

    @Override
    public ApplicationProperties load(String pathTo) {
        applicationProperties = new ApplicationProperties();
        return applicationProperties;
    }
}
