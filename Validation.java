package com.Exponent.UserManagment.Utility;

import java.util.Scanner;
import java.util.regex.Pattern;
import com.Exponent.UserManagment.Utility.ValidationException;

public class Validation {
	
	static Scanner sc=new Scanner(System.in);
	
	public static String getValidateUid() throws ValidationException   {
		System.out.println("Enter UID");
		String uid=sc.nextLine();
		
		
		if(Pattern.matches("^[A-Za-z][A-Za-z0-9_]{4,19}$", uid)) {
			System.out.println("Valid User Id Entered");
			return uid;
			
		}

		throw new ValidationException("Please Enter User Id In AlphaNumeric Format");
		
	}
	
	
	public static String getValidaName() throws ValidationException {
		
		System.out.println("Enter user Name");
		String name=sc.nextLine();
		
		if(Pattern.matches("^[A-Z][a-zA-Z]{1,19}$", name)) {
			System.out.println("Valid Name Entered");
			return name;
			
		}
		throw new ValidationException("Please Enter Valid User Name,Only Enters Charcter");
		
	}
	
	public static String getValidAddress() {
		System.out.println("Enter Adress");
		String address=sc.nextLine();
		
		if(Pattern.matches("^[A-Za-z0-9\\s,./-]{10,100}$", address)) {
			System.out.println("Valid Address Added");
			return address;
			
		}
		throw new CheckAddress("Pease Enter Address in Proper Format");
		
	}
	

}
