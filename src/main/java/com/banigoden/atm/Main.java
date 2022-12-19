package com.banigoden.atm;

import com.banigoden.atm.domain.ApplicationProperties;
import com.banigoden.atm.service.*;
import com.banigoden.atm.service.atm.Atm;
import com.banigoden.atm.service.atm.AtmFactory;

//TODO
//1. implement mvp of Atm firmware
// -functional
// load applicaion.properties
//      which format - key = value
//      how to get the path of the file - default near jar file or path could be define by command line arguments (for instance --p path)
// establish atm  instance
//      atm instance has next properties : name, uniqueId, model, owner(), path to db
//      depend on model instance we should create specific instance of ATM
// run serv clients
//      display user interface(command line interface)
//      interactive with user(start, authentication, getBalance, help, exit)
// - non functional
//      database of user is text file(db.txt)
public class Main {
    public static void main(String[] args) {
        String path = "application.properties";
        PropertiesService propertyService = new PropertiesFileServise();
        ApplicationProperties applicationProperties = propertyService.load(path);
        Atm atm = AtmFactory.getInstance().creatyAtm(applicationProperties);
        atm.startServ();
    }
}
