package com.qa.accountapp.accountapp;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import accounts.Account;
import accounts.AccountService;

public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello world to the standard out" );
        App app = new App();
        AccountService accServ = new AccountService();
        app.populateHash(accServ);
        app.convertHashToJson(accServ);
    }
    
    public void convertHashToJson(AccountService accServ) {
        HashMap<Integer,Account> hashToConvert = accServ.getHash();
        
        ObjectMapper mapper = new ObjectMapper();
        
        try {
        	mapper.writeValue(new File("C:\\Users\\Admin\\eclipse-workspace\\generated\\hashmap.json"), hashToConvert);
        	
        	String jsonInStringPls = mapper.writeValueAsString(hashToConvert);
        	System.out.println(jsonInStringPls);
        	
        	String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(hashToConvert);
        	System.out.println(jsonInString);
   
        } catch (JsonGenerationException e) {
        	e.printStackTrace();
        } catch (JsonMappingException e) {
        	e.printStackTrace();
        } catch (IOException e) {
        	e.printStackTrace();
        }
    }
    
    public void populateHash(AccountService accServ) {
    	Account account1 = new Account("Ekaterina", "Genova", 941115);
    	accServ.addAccount(account1);
    }
}
