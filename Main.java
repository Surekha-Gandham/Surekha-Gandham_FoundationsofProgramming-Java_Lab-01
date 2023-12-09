package com.greatlearning.email_app;

public class Main {

	public static void main(String[] args) {
		
//		testEmailAddressGeneration();
		
//		testPasswordGeneration();
		
		testApplicationEntryPoint();	
	}

	static void testEmailAddressGeneration(){
		
		CredentialsManagerServiceImpl obj 
		= new CredentialsManagerServiceImpl();
	
		String emailAddress 
			= obj.generateEmailAddress("Harshit", "Chauhan", 4);
		
		System.out.println(emailAddress);
		
	}
	
	static void testPasswordGeneration() {
		
		CredentialsManagerServiceImpl obj 
		= new CredentialsManagerServiceImpl();
	
		String password 
			= obj.generatePassword();
		
		System.out.println(password);		
	}
	
	static void testApplicationEntryPoint() {
		
		EmailApplication emailApplication = new EmailApplication();
		
		emailApplication.init();
	}
}