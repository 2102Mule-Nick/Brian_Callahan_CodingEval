package test;

import java.util.Scanner;

public class UpdatePersonPostgres {
	public void update(Scanner scanner) {
		System.out.println("Who would you like to update?");
		System.out.println("Enter the first name");
		String firstname = scanner.next();
		System.out.println("Enter the last name");
		String lastname = scanner.next();
		
		PersonPostgres userPost = new PersonPostgres();
		Person person = new Person(firstname,lastname);
		
		if (userPost.getPersonByName(firstname,lastname)!=null) {				
			
			System.out.println(userPost.getFatherIDByName(firstname, lastname)+" fatherss");
		}
		if (userPost.getPersonByName(firstname,lastname)!=null) {				
			
			System.out.println(userPost.getMotherIDByName(firstname, lastname)+" mothersss");
		}					
		}
}
