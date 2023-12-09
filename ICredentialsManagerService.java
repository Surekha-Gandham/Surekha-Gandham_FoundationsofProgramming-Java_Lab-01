package com.greatlearning.email_app;

public interface ICredentialsManagerService {

	String generateEmailAddress(
		String firstName, String lastName, 
		int departmentCode);

	String generatePassword();
	
	
	void displayGeneratedCredentials(Employee employee);

//	void displayGeneratedCredentials(
//			String firstname, String emailAddress,
//			String password);

}