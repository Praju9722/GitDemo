package com.Exponent.UserManagment.Controller;

import java.util.Scanner;

import com.Exponent.UserManagment.Implitention.UserImpli;
import com.Exponent.UserManagment.Service.UserService;
import com.Exponent.UserManagment.Utility.ValidationException;

public class UserController {
	public static void main(String[] args) throws ValidationException {
		
		System.out.println("===Welcome To Usermanagment====");
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		UserService us=new UserImpli();
		
		while(flag) {
			System.out.println("\t\t\t\t\t-------------------------------------------------\t\t\t\t\t\t");
			System.out.println("\t\t\t\t\t-------------------------------------------------\t\t\t\t\t\t");
			System.out.println("\t\t\t\t\t1:   Create User           ||");
			System.out.println("\t\t\t\t\t2:   Display User          ||");
			System.out.println("\t\t\t\t\t3:   Update User           ||");
			System.out.println("\t\t\t\t\t4:   Delete User             ||");
			System.out.println("\t\t\t\t\t7:   Exit                     ||");
			System.out.println("\t\t\t\t\t--------------------------------------------------\t\t\t\t\t\t");
			System.out.println("\t\t\t\t\t---------------------------------------------------\t\t\t\t\t\t");
			
			System.out.println("\t\t\t\t\tEnter Your Choioce:");
			int ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				us.create();
				break;
			case 2:
				us.display();
				break;
			case 3:
				us.update();
				break;
			case 4:
				us.delete();
				break;
			case 5:
				flag=false;
				break;
			default:
				System.out.println("Wrong Choice");
			break;
			
		}
		
		
	}
		sc.close();
		System.out.println("==Thank You User===");

}
}
