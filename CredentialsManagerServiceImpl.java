package com.greatlearning.email_app;

public class CredentialsManagerServiceImpl {
//	@Override
	public String generateEmailAddress(
			String firstName, String lastName, int departmentCode) {
		
//		String emailAddress = "";
//		
//		emailAddress = emailAddress + firstName;
//		emailAddress = emailAddress + lastName;
		
		
		StringBuilder emailAddressBuilder =
			new StringBuilder();
		
		// lower case conversion
		emailAddressBuilder.append(firstName.toLowerCase());
		
		emailAddressBuilder.append(".");
		
		// lower case conversion 
		emailAddressBuilder.append(lastName.toLowerCase());
		
		emailAddressBuilder.append("@");
		
		String departmentName = "";
		
		if (departmentCode == 1) {
			departmentName = "tech";
		}else if (departmentCode == 2) {
			departmentName = "admin";
		}else if (departmentCode == 3) {
			departmentName = "hr";
		}else if (departmentCode == 4) {
			departmentName = "legal";
		}else {
			
			System.out.println("Incorrect department code value");
		}
		
		// TODO - Include @, departmentName, 'gl.com'
		
		emailAddressBuilder.append(departmentName);
		
		emailAddressBuilder.append(".");
		
		emailAddressBuilder.append("gl.com");
				
		// Department name from department code		
			// Use of if-else
			// switch case
		
		return emailAddressBuilder.toString();
	}

	public String generatePassword_Old() {
		
		String capitalLeters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallCaseLetters = "abcdefghijklmnopqrstuvwxyz";		
		String numbers = "0123456789";
		String specialCharacters = "~@#$%^&*()-=+<>?'][}{";
		
		String allCharacters = 
				capitalLeters + smallCaseLetters
				+ numbers + specialCharacters;
		// 83
		// A...Z a .. z 0....9 @#.....)
		// 17 36 8 4 55 78 1 9 125 [Error]
		// T m J & 9 t 
		//
		
		System.out.println("Total number of characters identified ");
		System.out.println(allCharacters.length());
		
		System.out.println(allCharacters);
		
		int maxRange = allCharacters.length();
		
		StringBuilder passwordBuilder = new StringBuilder();
		
		for (int index = 1; index <=8; index ++) {
			
			java.util.Random randomObj 
				= new java.util.Random();
			
			int randomValue = randomObj.nextInt(maxRange);
			System.out.println("Random Value is " + randomValue);
			

			char randomCharValue = allCharacters.charAt(randomValue);
			
			System.out.println("Random Char Value " + randomCharValue);
			
			passwordBuilder.append(randomCharValue);
		}
		
		return passwordBuilder.toString();
	}

	public String generatePassword() {
		
		String capitalLeters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallCaseLetters = "abcdefghijklmnopqrstuvwxyz";		
		String numbers = "0123456789";
		String specialCharacters = "~@#$%^&*()-=+<>?'][}{";
				
		StringBuilder passwordBuilder = new StringBuilder();

		// 1st category - 2 characters		
		for (int index = 1; index <=2; index ++) {
			
			java.util.Random randomObj 
				= new java.util.Random();
			
			int randomValue = randomObj.nextInt(capitalLeters.length());
//			System.out.println("Random Value is " + randomValue);

			char randomCharValue = capitalLeters.charAt(randomValue);
			passwordBuilder.append(randomCharValue);
		}
		
		// 2nd categoryy - 2 characters
		for (int index = 1; index <=2; index ++) {
			
			java.util.Random randomObj 
				= new java.util.Random();
			
			int randomValue = randomObj.nextInt(smallCaseLetters.length());
//			System.out.println("Random Value is " + randomValue);

			char randomCharValue = smallCaseLetters.charAt(randomValue);
			passwordBuilder.append(randomCharValue);
		}		
		
		
		// 3rd categoryy - 2 characters
		for (int index = 1; index <=2; index ++) {
			
			java.util.Random randomObj 
				= new java.util.Random();
			
			int randomValue = randomObj.nextInt(numbers.length());
//			System.out.println("Random Value is " + randomValue);

			char randomCharValue = numbers.charAt(randomValue);
			passwordBuilder.append(randomCharValue);
		}			
		
		// 4th categoryy - 2 characters
		for (int index = 1; index <=2; index ++) {
			
			java.util.Random randomObj 
				= new java.util.Random();
			
			int randomValue = randomObj.nextInt(specialCharacters.length());
//			System.out.println("Random Value is " + randomValue);

			char randomCharValue = specialCharacters.charAt(randomValue);
			passwordBuilder.append(randomCharValue);
		}			

		return passwordBuilder.toString();
	}	
	public void displayGeneratedCredentials(Employee employee) {
		
		System.out.println("Dear " + employee.getFirstname()
				+ ", your generated credentials are as follows");
		
		System.out.println("Email        --->  " + employee.getEmailAddress());
		System.out.println("Password     --->  " + employee.getPassword());		
	}
}
