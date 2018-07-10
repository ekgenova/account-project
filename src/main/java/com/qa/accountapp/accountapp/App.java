package com.qa.accountapp.accountapp;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import accounts.Account;
import accounts.AccountService;
import converters.JavaToJSONConverter;
import converters.JavaToXMLConverter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello world to the standard out" );
        
        App app = new App();
        AccountService accServ = new AccountService();
        JavaToXMLConverter jxml = new JavaToXMLConverter();
        JavaToJSONConverter jjson = new JavaToJSONConverter();
        
        app.populateHash(accServ);
        
        jjson.convertHashToJson(accServ);
        
        jxml.convertHashToXML(accServ, accServ);
    }
    

    
    public void populateHash(AccountService accServ) {
    	Account account1 = new Account("Ekaterina", "Genova", 941115);
    	accServ.addAccount(account1);
    }
    
 
}
